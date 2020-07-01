package com.greenfoxacademy.springstart;

public class Greeting {
  long id = 1;
  String content = "Hello, World!";

  public Greeting(String name){
    this.content = "Hello, " + name + "!";
  }

  public long getId(){
    return this.id;
  }

  public String getContent(){
    return this.content;
  }
}
