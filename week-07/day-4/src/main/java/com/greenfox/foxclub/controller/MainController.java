package com.greenfox.foxclub.controller;

import com.greenfox.foxclub.model.Fox;
import com.greenfox.foxclub.service.FoxList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

  @RequestMapping("/")
  public String index(@RequestParam(defaultValue = "Mr Fox") String name, Model model){
    Fox newFox = new Fox(name);
    model.addAttribute("name", newFox.getName());
    model.addAttribute("food", newFox.getFood().toString());
    model.addAttribute("drink", newFox.getDrink().toString());
    if (newFox.getTricks().size() == 0) {
      model.addAttribute("numberoftricks", "This fox knows nothing.");
    }
    else {
      model.addAttribute("numberoftricks", "This fox knows " + newFox.getTricks().size() +" tricks.");
    }
    return "index";
  }

  @RequestMapping("/login")
  public String getLogin(){
    return "login";
  }

  @PostMapping("/name")
  public String postLogin(@RequestParam(value = "new-name") String name, Model model){
    return "redirect:/?name="+name;
  }
}
