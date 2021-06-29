package com.vitassalvantes.webkrypto.controllers;

import com.vitassalvantes.webkrypto.ciphers.CaesarCipher;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CiphersController {

    @GetMapping("/caesar")                      // TODO: switch-case
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

    @GetMapping("/sandbox")
    public String sandbox(Model model) {
        return "sandbox";
    }

    @PostMapping("/sandbox")
    public String result(@RequestParam String cipher, @RequestParam String action, @RequestParam String message, Model model) {
        switch (cipher) {
            case "Caesar cipher":
                message = new CaesarCipher()
            case "Atbash cipher":

            case "Code word cipher":
        }
        return "result";
    }
}
