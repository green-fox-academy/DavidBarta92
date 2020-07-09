package com.greenfox.foxclub.model;

public class Trick {
  private Integer idCounter = 0;
  private Integer id;
  private String name;

  public Trick(String name){
    this.name = name;
    this.id = idCounter;
    this.idCounter = this.idCounter++;
  }
}
