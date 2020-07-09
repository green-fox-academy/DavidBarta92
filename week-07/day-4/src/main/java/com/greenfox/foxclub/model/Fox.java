package com.greenfox.foxclub.model;

import com.greenfox.foxclub.service.FoxList;

import java.util.ArrayList;
import java.util.List;

public class Fox {
  private String name;
  private Food food;
  private Drink drink;
  private List<Trick> tricks;
  private Integer id = 0;

  public Fox(String name){
    this.name = name;
    this.food = Food.fish;
    this.drink = Drink.water;
    this.tricks = new ArrayList<>();
    this.id = this.id++;
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
