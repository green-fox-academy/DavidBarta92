package com.greenfox.di.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class YellowColor implements MyColor{

  @Autowired
  public YellowColor(){
  }

  @Override
  public void printColor() {
    System.out.println("It is yellow in color...");
  }
}
