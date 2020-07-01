package com.greenfoxacademy.springstart.controllers;

public class Greeting {
  long greetCount = AtomicLong.getNum();
  String content = "Hello, World!";

  public Greeting(String name){
    this.greetCount = 0;
    this.content = "Hello, " + name + "!";
  }


  public String getContent(){
    return this.content;
  }
}
