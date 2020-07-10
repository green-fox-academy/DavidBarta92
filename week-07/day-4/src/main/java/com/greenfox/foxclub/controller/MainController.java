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
  public String index(@RequestParam(defaultValue = "MrFox") String name, Model model) {
    if (foxList.getTheList().contains(name)) { // nem mukodik
      return "redirect:/login";
    }
    else{
    Fox currentFox = foxList.getTheFox(name);
    model.addAttribute("name", currentFox.getName());
    model.addAttribute("food", currentFox.getFood().toString());
    model.addAttribute("drink", currentFox.getDrink().toString());
    if (currentFox.getTricks().size() == 0) {
      model.addAttribute("numberoftricks", "This fox knows nothing.");
    } else {
      model.addAttribute("numberoftricks", "This fox knows " + currentFox.getTricks().size() + " tricks.");
    }
    return "index";
    }
  }

  @RequestMapping("/login")
  public String getLogin() {
    return "login";
  }

  @PostMapping("/name")
  public String postLogin(@RequestParam(value = "new-name") String name, Model model) {
      foxList.addNewFoxToTheClub(new Fox(name));
      return "redirect:/?name=" + name;
  }

  @RequestMapping("/nutritionStore")
  public String nutritionStore(@RequestParam String name, Model model) {
    Fox currentFox = foxList.getTheFox(name);
    model.addAttribute("name", currentFox.getName());
    return "/nutritionStore";
  }

  @PostMapping("/nutrition")
  public String nutrition(@RequestParam String name,
                          @RequestParam (name = "new-food")String food,
                          @RequestParam (name = "new-drink")String drink, Model model) {
    foxList.getTheFox(name).setFood(food);
    foxList.getTheFox(name).setDrink(drink);
    return "redirect:/?name=" + name;
  }
}
