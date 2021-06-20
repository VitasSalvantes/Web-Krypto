package com.vitassalvantes.webkrypto.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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
}
