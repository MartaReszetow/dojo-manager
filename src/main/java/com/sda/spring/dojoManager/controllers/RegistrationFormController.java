package com.sda.spring.dojoManager.controllers;

import com.sda.spring.dojoManager.dtos.UserDTO;
import com.sda.spring.dojoManager.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RegistrationFormController {

private final UserService userService;

    public RegistrationFormController(UserService userService) {
        this.userService = userService;
    }


    @RequestMapping("/index")
    public String index(Model model) {
        return "index";
    }


    @RequestMapping("/registrationForm")
    public String registrationForm(Model model) {
        model.addAttribute("formDTO", new UserDTO());
           return "registrationForm";
    }

    @RequestMapping(method = RequestMethod.POST, path = "/registrationForm")
    public String postRegistrationForm(UserDTO formDTO) {

       userService.createNewUser(formDTO);
        System.out.println("created new user" + formDTO.getLogin());
        return "index";
    }
}




