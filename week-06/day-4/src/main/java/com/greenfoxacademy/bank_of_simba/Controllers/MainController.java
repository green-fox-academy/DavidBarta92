package com.greenfoxacademy.bank_of_simba.Controllers;

import com.greenfoxacademy.bank_of_simba.Model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
  BankAccount bankAccount = new BankAccount("Simba", 2000, "lion");

  @GetMapping("/show")
  public String show(Model model) {
    model.addAttribute("bankaccount", bankAccount);
    return "AccountsPage";
  }
}
