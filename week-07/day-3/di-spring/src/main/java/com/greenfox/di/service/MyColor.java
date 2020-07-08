package com.greenfox.di.service;

import org.springframework.beans.factory.annotation.Autowired;

public interface MyColor {

  @Autowired
  public void printColor();
}
