package com.greenfoxacademy.bank_of_simba.Controllers;

import com.greenfoxacademy.bank_of_simba.Model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class MainController {

  List<BankAccount> accounts = new ArrayList<>(Arrays.asList(
      new BankAccount("Zordon", 80, "lion"),
      new BankAccount("Zazu", 30, "tiger"),
      new BankAccount("Papi", 500, "jaguar"),
      new BankAccount("Lajos", 7000, "puma")
  ));
  BankAccount bankAccount = new BankAccount("Simba", 2000, "lion");

  @GetMapping("/show")
  public String show(Model model) {

    model.addAttribute("bankaccount", bankAccount);
    return "Index";
  }

  @GetMapping("/enjoy")
  public String enjoy(Model model) {
    String enjoyString = "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";
    model.addAttribute("enjoy", enjoyString);
    return "Enjoy";
  }

  @GetMapping("/allaccount")
  public String allAccount(Model model) {

    model.addAttribute("account", accounts);
    model.addAttribute("bankaccount", bankAccount);

    return "AccountsPage";
  }
}
