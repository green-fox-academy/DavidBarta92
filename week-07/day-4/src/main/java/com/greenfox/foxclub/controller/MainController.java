package com.greenfox.foxclub.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
  @RequestMapping("/")
  public String index(Model model){
    model.addAttribute("name", "Mr. Fox");
    return "index";
  }

  @RequestMapping("/login")
  public String getLogin(){
    return "login";
  }

  @PostMapping("/name")
  public String postLogin(@RequestParam(value = "new-name") String newName, Model model){
    model.addAttribute("name", newName);
    return "index";
  }
}
