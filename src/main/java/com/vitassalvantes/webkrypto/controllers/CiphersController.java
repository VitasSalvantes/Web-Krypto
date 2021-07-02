package com.vitassalvantes.webkrypto.controllers;

import com.vitassalvantes.webkrypto.ciphers.AtbashCipher;
import com.vitassalvantes.webkrypto.ciphers.CaesarCipher;
import com.vitassalvantes.webkrypto.ciphers.CodeWordCipher;
import com.vitassalvantes.webkrypto.models.Cipher;
import com.vitassalvantes.webkrypto.repo.CipherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CiphersController {

    @Autowired
    private CipherRepository cipherRepository;

    @GetMapping("/caesar")
    public String caesarCipher(Model model) {
        if (cipherRepository.existsByName("Caesar cipher")) {
            Cipher caesarCipher = cipherRepository.findCipherByName("Caesar cipher");
            String name = caesarCipher.getName();
            String description = caesarCipher.getDescription();
            model.addAttribute("name", name);
            model.addAttribute("description", description);
        } else {
            return "redirect:/edit_cipher";
        }
        return "cipher";
    }

    @GetMapping("/atbash")
    public String atbashCipher(Model model) {
        if (cipherRepository.existsByName("Atbash cipher")) {
            Cipher atbashCipher = cipherRepository.findCipherByName("Atbash cipher");
            String name = atbashCipher.getName();
            String description = atbashCipher.getDescription();
            model.addAttribute("name", name);
            model.addAttribute("description", description);
        } else {
            return "redirect:/edit_cipher";
        }
        return "cipher";
    }

    @GetMapping("/code-word")
    public String codeWordCipher(Model model) {
        if (cipherRepository.existsByName("Code word cipher")) {
            Cipher codeWordCipher = cipherRepository.findCipherByName("Code word cipher");
            String name = codeWordCipher.getName();
            String description = codeWordCipher.getDescription();
            model.addAttribute("name", name);
            model.addAttribute("description", description);
        } else {
            return "redirect:/edit_cipher";
        }
        return "cipher";
    }

    @GetMapping("/edit_cipher")
    public String editCipher(@RequestParam(defaultValue = "Test name") String name, @RequestParam(defaultValue = "Test description") String description, Model model) {
        model.addAttribute("name", name);
        model.addAttribute("description", description);
        return "edit_cipher";
    }

    @PostMapping("/edit_cipher")
    public String saveEditCipher(@RequestParam(defaultValue = "Test name") String name, @RequestParam(defaultValue = "Test description") String description, Model model) {
        if (cipherRepository.existsByName(name)){
            Cipher cipher = cipherRepository.findCipherByName(name);
            cipher.setName(name);
            cipher.setDescription(description);
            cipherRepository.save(cipher);
        } else {
            Cipher cipher = new Cipher(name, description);
            cipherRepository.save(cipher);
        }
        return "home";
    }

    @PostMapping("/caesar")
    public String caesarResult(@RequestParam(defaultValue = "Encryption") String action, @RequestParam(defaultValue = "0") int key, @RequestParam(defaultValue = "Hello world!") String message, Model model) {
        String result;
        CaesarCipher cc = new CaesarCipher();
        cc.setKey(key);
        cc.setInputMessage(message);

        if (action.equals("Encryption")) {
            result = cc.encryption();
        } else {
            result = cc.decryption();
        }

        model.addAttribute("result", result);
        return "result";
    }

    @PostMapping("/atbash")
    public String atbashResult(@RequestParam(defaultValue = "Hello world!") String message, Model model) {
        AtbashCipher ac = new AtbashCipher();
        ac.setInputMessage(message);

        String result = ac.encryption();

        model.addAttribute("result", result);
        return "result";
    }

    @PostMapping("/code-word")
    public String codeWordResult(@RequestParam(defaultValue = "Encryption") String action, @RequestParam(defaultValue = "0") String key, @RequestParam(defaultValue = "Hello world!") String message, Model model) {
        String result;
        CodeWordCipher cwc = new CodeWordCipher();
        cwc.setCodeWord(key);
        cwc.setInputMessage(message);

        if (action.equals("Encryption")) {
            result = cwc.encryption();
        } else {
            result = cwc.decryption();
        }

        model.addAttribute("result", result);
        return "result";
    }
}