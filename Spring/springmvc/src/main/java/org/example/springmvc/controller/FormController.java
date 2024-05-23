package org.example.springmvc.controller;

import jakarta.validation.Valid;
import org.example.springmvc.domain.User2;
import org.example.springmvc.domain.UserForm;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {
    @GetMapping("/form")
    public String showForm() {
        return "form";
    }

//    @PostMapping("/submitForm")
//    public String submitForm(@RequestParam String username,
//                             @RequestParam String password) {
//        System.out.println(username + "::" + password);
//        return "result";
//    }

//    @PostMapping("/submitForm")
//    public String submitForm(@ModelAttribute User2 user) {
//        System.out.println(user.getUsername() + "::" + user.getPassword());
//        return "result";
//    }

    @PostMapping("/submitForm")
    public String submitForm(@Valid @ModelAttribute("userForm")UserForm userForm,
                             BindingResult result) {
        if(result.hasErrors()) {
            return "form";
        }
        return "result";
    }
}
