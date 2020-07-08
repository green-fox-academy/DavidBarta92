package com.greenfox.di.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Component
@Service
public class Printer implements MyColor{

  @Autowired
  public Printer(){
  }

  public void log(String message) {
    System.out.println(LocalDateTime.now() + " MY PRINTER SAYS --- " + message);
  }

  @Override
  public void printColor() {

  }

}