package com.greenfox.foxclub.controller;

import com.greenfox.foxclub.model.Fox;
import com.greenfox.foxclub.service.FoxList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {
  FoxList foxList = new FoxList();

  @RequestMapping("/")
  public String index(@RequestParam(defaultValue = "MrFox") String name, Model model){
    Fox him = foxList.getTheFox(name);
    model.addAttribute("name", him.getName());
    model.addAttribute("food", him.getFood().toString());
    model.addAttribute("drink", him.getDrink().toString());
    if (him.getTricks().size() == 0) {
      model.addAttribute("numberoftricks", "This fox knows nothing.");
    }
    else {
      model.addAttribute("numberoftricks", "This fox knows " + him.getTricks().size() +" tricks.");
    }
    return "index";
  }

  @RequestMapping("/login")
  public String getLogin(){
    return "login";
  }

  @PostMapping("/name")
  public String postLogin(@RequestParam(value = "new-name") String name, Model model){
    foxList.addNewFoxToTheClub(new Fox(name));
    return "redirect:/?name="+name;
  }
}
