package com.greenfox.webshop.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class Controller {

  @RequestMapping("/hello")
  public String hello(Model model){
    model.addAttribute("name", "HelloWorld");
    return "hello";
  }


}
