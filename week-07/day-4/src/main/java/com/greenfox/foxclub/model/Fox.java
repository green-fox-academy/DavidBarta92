package com.greenfox.foxclub.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Fox {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;
  private Food food;
  private Drink drink;
  private List<Trick> tricks;

  public Fox(){
    this.name = name;
    this.food = Food.fish;
    this.drink = Drink.water;
    this.tricks = new ArrayList<>();
  }

  public Fox(String name){
    this.name = name;
    this.food = Food.fish;
    this.drink = Drink.water;
    this.tricks = new ArrayList<>();
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