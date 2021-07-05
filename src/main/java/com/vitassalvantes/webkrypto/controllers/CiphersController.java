package com.vitassalvantes.webkrypto.controllers;

import com.vitassalvantes.webkrypto.ciphers.AtbashCipher;
import com.vitassalvantes.webkrypto.ciphers.CaesarCipher;
import com.vitassalvantes.webkrypto.ciphers.CodeWordCipher;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Controller for handling requests to cipher pages
 *
 * @author VitasSalvantes
 * @version 2.0
 */
@Controller
public class CiphersController {

    @GetMapping("/caesar")
    public String caesarCipher(Model model) {
        model.addAttribute("title", "Caesar cipher");
        return "caesar";
    }

    @GetMapping("/atbash")
    public String atbashCipher(Model model) {
        model.addAttribute("title", "Atbash cipher");
        return "atbash";
    }

    @GetMapping("/code-word")
    public String codeWordCipher(Model model) {
        model.addAttribute("title", "Code word cipher");
        return "code_word";
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

        model.addAttribute("output_message", result);
        return "result";
    }

    @PostMapping("/atbash")
    public String atbashResult(@RequestParam(defaultValue = "Hello world!") String message, Model model) {
        AtbashCipher ac = new AtbashCipher();
        ac.setInputMessage(message);

        String result = ac.encryption();

        model.addAttribute("output_message", result);
        return "result";
    }

    @PostMapping("/code-word")
    public String codeWordResult(@RequestParam(defaultValue = "Encryption") String action, @RequestParam(defaultValue = "a") String key, @RequestParam(defaultValue = "Hello world!") String message, Model model) {
        String result;
        CodeWordCipher cwc = new CodeWordCipher();
        cwc.setCodeWord(key);
        cwc.setInputMessage(message);

        if (action.equals("Encryption")) {
            result = cwc.encryption();
        } else {
            result = cwc.decryption();
        }

        model.addAttribute("output_message", result);
        return "result";
    }
}