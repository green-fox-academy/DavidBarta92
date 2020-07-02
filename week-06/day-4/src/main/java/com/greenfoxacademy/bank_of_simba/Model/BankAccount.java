package com.greenfoxacademy.bank_of_simba.Model;

public class BankAccount {
  private String name;
  private int balance;
  private String animalType;
  public String kingStyleClass;
  private boolean good;

  public BankAccount(String name, int balance, String animalType, String king, boolean good) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    this.kingStyleClass = king;
    this.good = good;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getBalance() {
    return balance;
  }

  public void setBalance(int balance) {
    this.balance = balance;
  }

  public String getAnimalType() {
    return animalType;
  }

  public void setAnimalType(String animalType) {
    this.animalType = animalType;
  }

  public boolean getGood(){
    return this.good;
  }
}
