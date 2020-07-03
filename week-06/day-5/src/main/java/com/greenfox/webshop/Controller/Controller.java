package com.greenfox.webshop.Controller;

import com.greenfox.webshop.Model.ShopItem;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {

  List<ShopItem> Store = new ArrayList<>(Arrays.asList(
      new ShopItem("Running shoes", 1000,
          "Nike running shoes for every day sport", 1),
      new ShopItem("Printer", 3000,
          "Some HP printer that will print pages", 100),
      new ShopItem("Coke", 25,
          "0.5l standard coke", 0),
      new ShopItem("Wokin", 119,
          "Chicken with fried rice and wokin", 0),
      new ShopItem("T-shirt", 300,
          "Blue with a corgi on bike", 9),
      new ShopItem("Running shoes", 1000,
          "Nike running shoes for every day sport", 7),
      new ShopItem("Running shoes", 1000,
          "Nike running shoes for every day sport", 0)
  ));

  @GetMapping("/hello")
  public String hello(Model model){
    model.addAttribute("Store", Store);
    return "index";
  }

  @GetMapping("/only-available")
  public String availables(Model model) {
    List<ShopItem> availables = new ArrayList<ShopItem>();
    for (int i = 0; i < Store.size(); i++){
      if (Store.get(i).getQuantity() > 0) {
        availables.add(Store.get(i));
      }
    }
    model.addAttribute("Store", availables);
    return "index";
  }


}
