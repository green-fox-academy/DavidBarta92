package com.greenfoxacademy.bank_of_simba.Controllers;

import com.greenfoxacademy.bank_of_simba.Model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class MainController {

  List<BankAccount> accounts = new ArrayList<>(Arrays.asList(
      new BankAccount("Zordon", 80, "lion", "king", false),
      new BankAccount("Zazu", 30, "tiger", "notKing", true),
      new BankAccount("Papi", 500, "jaguar", "notKing", true),
      new BankAccount("Lajos", 7000, "puma", "notKing", true)
  ));
  BankAccount bankAccount = new BankAccount("Simba", 2000, "lion", "king", true);

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

    model.addAttribute("accounts", accounts);
    model.addAttribute("bankaccount", bankAccount);
    return "AccountsPage";
  }

  @PostMapping("/raise")
  public void raise(){
    accounts.stream().forEach(n -> n.setBalance(n.getBalance()+10));
  }
}
