package com.greenfox.webshop.Controller;

import com.greenfox.webshop.Model.ShopItem;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {

  List<ShopItem> Store = new ArrayList<>(Arrays.asList(
      new ShopItem("Running shoes", 1000,
          "Nike running shoes for every day sport"),
      new ShopItem("Printer", 3000,
          "Some HP printer that will print pages"),
      new ShopItem("Coke", 25,
          "0.5l standard coke"),
      new ShopItem("Wokin", 119,
          "Chicken with fried rice and wokin"),
      new ShopItem("T-shirt", 300,
          "Blue with a corgi on bike"),
      new ShopItem("Running shoes", 1000,
          "Nike running shoes for every day sport"),
      new ShopItem("Running shoes", 1000,
          "Nike running shoes for every day sport")
  ));

  @GetMapping("/hello")
  public String hello(Model model){
    model.addAttribute("name", "HelloWorld");
    return "hello";
  }




}
