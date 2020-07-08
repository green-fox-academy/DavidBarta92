package com.greenfox.di.service;

import org.springframework.beans.factory.annotation.Autowired;

public class RedColor implements MyColor{

  @Override
  @Autowired
  public void printColor() {
    System.out.println("It is red in color...");
  }
}
