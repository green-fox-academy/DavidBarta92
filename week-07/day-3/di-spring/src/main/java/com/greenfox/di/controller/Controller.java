package com.greenfox.di.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {

  @GetMapping("/useful")
  public String main(Model model){
    return "index";
  }

  @GetMapping("/useful/colored")
  public String colored(Model model){
    return "Hello World";
  }

  @GetMapping("/useful/email")
  public String mail(Model model){
    return "Hello World";
  }

  @GetMapping("/decoder")
  public String decoder(Model model){
    return "Hello World";
  }
}
