package com.greenfox.webshop.Model;

public class ShopItem {
  private int price;
  private String name;
  private String description;

  public ShopItem(String name, int price, String description){
    this.name = name;
    this.price = price;
    this.description = description;
  }

  public String getName(){
    return this.name;
  }

  public int getPrice() {
    return this.price;
  }

}
