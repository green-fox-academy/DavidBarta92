package com.greenfox.di.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpellcheckerApplication implements CommandLineRunner {

  private Printer printer;
  private MyColor color;

  @Autowired
  SpellcheckerApplication(Printer printer) {
    this.printer = printer;
    this.color = new BlueColor();
  }

  public static void main(String[] args) {
    SpringApplication.run(SpellcheckerApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    printer.log("hello");
    color.printColor();
  }
}
