package com.greenfox.webshop.Controller;

import com.greenfox.webshop.Model.ShopItem;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.*;
import java.util.stream.Collectors;

@org.springframework.stereotype.Controller
public class Controller {

  static List<ShopItem> Store = new ArrayList<>(Arrays.asList(
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
    List<ShopItem> nike = Controller.contains("nike");
    model.addAttribute("Store", nike);
    return "index";
  }

  @GetMapping("/average-stock")
  public String average(Model model) {
    OptionalDouble avg = Store.stream().mapToDouble(ShopItem::getQuantity).average();
    model.addAttribute("average", avg);
    return "average";
  }

  @GetMapping("/most-expensive")
  public String mostExpensive(Model model) {


    return "index";
  }

  @PostMapping("/search")
  public String search(@RequestParam(value = "searchbar") String search, Model model) {
    List<ShopItem> result = Controller.contains(search.toLowerCase());
    model.addAttribute("Store", result);
    return "index";
  }

  public static List<ShopItem> contains(String world){
    List<ShopItem> foundedWorlds = Store.stream()
        .filter(i -> i.getName().toLowerCase()
            .contains(world) || i.getDescription().toLowerCase().contains(world))
        .collect(Collectors.toList());
    return foundedWorlds;
  }

}
