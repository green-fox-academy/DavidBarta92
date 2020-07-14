package com.greenfox.error.model.controller;

import com.greenfox.error.model.service.UserService;
import com.greenfox.error.model.service.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by aze on 25/10/17.
 */
@Controller
public class AppController {

    private UserService service;

    @Autowired
    public AppController(UserService service){
        this.service = service;
    }

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("new_user", new User());
        model.addAttribute("yolo", service.getAll());
        return "main";
    }

    @PostMapping("/app")
    public String create() {
        service.save(new User());
        return "redirect:/";
    }
}