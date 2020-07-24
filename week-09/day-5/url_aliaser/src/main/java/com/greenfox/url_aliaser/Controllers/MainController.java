package com.greenfox.url_aliaser.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

  @GetMapping("/")
  public String main() {
    return "main";
  }

  @PostMapping("/save-link")
  public String save(@RequestParam(name = "url") String url,
                     @RequestParam(name = "alias") String alias) {

    return "redirect:/";
  }

  @GetMapping("/a/{alias}")
  public String a(@PathVariable(name = "alias") String alias) {

    return "redirect:/";
  }
}
