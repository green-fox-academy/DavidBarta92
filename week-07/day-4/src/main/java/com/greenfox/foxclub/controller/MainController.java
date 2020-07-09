package com.greenfox.foxclub.controller;

import com.greenfox.foxclub.model.Fox;
import com.greenfox.foxclub.model.FoxClub;
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
    Fox newFox = new Fox(newName);
    model.addAttribute("name", FoxClub.getTheLastFox().getName());
    model.addAttribute("food", FoxClub.getTheLastFox().getFood().toString());
    model.addAttribute("drink", FoxClub.getTheLastFox().getDrink().toString());
    if (FoxClub.getTheLastFox().getTricks().size() == 0) {
      model.addAttribute("numberoftricks", "This fox is like Jon Snow...");
    }
    else {
      model.addAttribute("numberoftricks", "This fox knows " + FoxClub.getTheLastFox().getTricks().size() +" tricks.");
    }
    return "redirect:/index";
  }
}
