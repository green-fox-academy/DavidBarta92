package com.greenfox.foxclub.model;

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

  public void setFood(String foodString){
    this.food = this.food.valueOf(foodString);
  }

  public void setDrink(String drinkString){
    this.drink = this.drink.valueOf(drinkString);
  }

  public void giveNewTrick(String trickString){
    Trick newOne = Trick.doNothing;
    if (trickString.contains("write HTML")) {
      newOne = Trick.writeHTML;
    }
    if (trickString.contains("code in java")) {
      newOne = Trick.codeInJava;
    }
    if (trickString.contains("code in c++")) {
      newOne = Trick.codeInCplusplus;
    }
    if (trickString.contains("code in PHP")) {
      newOne = Trick.codeInPHP;
    }
    if (trickString.contains("use SQL")) {
      newOne = Trick.useSQL;
    }
    if (!this.tricks.contains(newOne)) {
      this.tricks.add(newOne);
    }
  }
}