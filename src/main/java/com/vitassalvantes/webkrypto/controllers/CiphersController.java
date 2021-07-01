package com.vitassalvantes.webkrypto.controllers;

import com.vitassalvantes.webkrypto.ciphers.CaesarCipher;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CiphersController {

    @GetMapping("/caesar")
    public String caesarCipher(Model model) {
        String title = "Title1";
        String description = "Description1";
        model.addAttribute("title", title);
        model.addAttribute("description", description);
        return "cipher";
    }

    @GetMapping("/atbash")
    public String atbashCipher(Model model) {
        String title = "Title2";
        String description = "Description2";
        model.addAttribute("title", title);
        model.addAttribute("description", description);
        return "cipher";
    }

    @GetMapping("/code-word")
    public String codeWordCipher(Model model) {
        String title = "Title3";
        String description = "Description3";
        model.addAttribute("title", title);
        model.addAttribute("description", description);
        return "cipher";
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
    public String atbashResult(Model model) {
        String result = "It's atbash";
        model.addAttribute("result", result);
        return "result";
    }

    @PostMapping("/code-word")
    public String codeWordResult(Model model) {
        String result = "It's code word";
        model.addAttribute("result", result);
        return "result";
    }
}