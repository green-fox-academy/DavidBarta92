package com.greenfox.foxclub.model;

import java.util.List;

public class Fox {
  private String name;
  private Food food;
  private Drink drink;
  private List<Trick> tricks;

  public Fox(String name){
    this.name = name;
    this.food = Food.fish;
    this.drink = Drink.water;
    FoxClub.addNewFoxToTheClub(this);
  }

  public String getName() {
    return name;
  }

  public Drink getDrink() {
    return drink;
  }

  public Food getFood() {
    return food;
  }

  public List<Trick> getTricks() {
    return tricks;
  }
}
