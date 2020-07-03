package com.greenfox.webshop.Model;

public class ShopItem {
  private int price;
  private String name;
  private String description;
  private int quantity;

  public ShopItem(String name, int price, String description, int quantity){
    this.name = name;
    this.price = price;
    this.description = description;
    this.quantity = quantity;
  }

  public String getName(){
    return this.name;
  }

  public int getPrice() {
    return this.price;
  }

  public String getDescription(){
    return this.description;
  }

  public int getQuantity(){
    return this.quantity;
  }
}
