package com.greenfox.webshop.Controller;

import com.greenfox.webshop.Model.ShopItem;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.*;
import java.util.stream.Collectors;

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
  public String hello(Model model) {
    model.addAttribute("Store", Store);
    return "index";
  }

  @GetMapping("/only-available")
  public String availables(Model model) {
    List<ShopItem> availables = Store.stream().filter(n -> n.getQuantity() > 0).collect(Collectors.toList());
    model.addAttribute("Store", availables);
    return "index";
  }

  @GetMapping("/cheapest-first")
  public String cheapest(Model model) {
    List<ShopItem> cheapest = Store.stream()
        .sorted(Comparator.comparing(ShopItem::getPrice))
        .collect(Collectors.toList());
    model.addAttribute("Store", cheapest);
    return "index";
  }

  @GetMapping("/contains-nike")
  public String nike(Model model) {
    List<ShopItem> cheapest = Store.stream()
        .filter(n -> n.getName().toLowerCase().contains("nike") || n.getDescription().toLowerCase().contains("nike"))
        .collect(Collectors.toList());
    model.addAttribute("Store", cheapest);
    return "index";
  }

  @GetMapping("/average-stock")
  public String average(Model model) {
    OptionalDouble avg = Store.stream().mapToDouble(ShopItem::getQuantity).average();
    model.addAttribute("average", avg);
    return "average";
  }


}
