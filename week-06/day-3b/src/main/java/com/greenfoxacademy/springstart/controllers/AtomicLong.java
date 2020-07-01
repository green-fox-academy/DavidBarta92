package com.greenfoxacademy.springstart.controllers;

public class AtomicLong {
  static long greetCount = 0;

  public static void setNumByOne(){
    AtomicLong.greetCount = AtomicLong.greetCount + 1;
  }

  public static long getNum(){
    return AtomicLong.greetCount;
  }
}
