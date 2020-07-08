package com.greenfox.di.service;

import org.springframework.stereotype.Service;

public class BlueColor implements MyColor{

  @Override
  public void printColor() {
    System.out.println("It is blue in color...");
  }
}
