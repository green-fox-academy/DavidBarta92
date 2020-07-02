package com.greenfoxacademy.bank_of_simba;

import Model.BankAccount;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BankOfSimbaApplication {

  public static void main(String[] args) {
    SpringApplication.run(BankOfSimbaApplication.class, args);
  }
    BankAccount animal = new BankAccount("Simba", 100, "lion");
}
