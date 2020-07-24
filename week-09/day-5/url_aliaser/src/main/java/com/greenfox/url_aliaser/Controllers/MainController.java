package com.greenfox.url_aliaser.Controllers;

import com.greenfox.url_aliaser.Model.Entry;
import com.greenfox.url_aliaser.Service.EntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class MainController {

  @Autowired
  private EntryService entryService;

  @GetMapping("/")
  public String main(@RequestParam(name = "url", required = false) String url,
                     @RequestParam(name = "alias", required = false) String alias,
                     @RequestParam(name = "message", required = false) String message, Model model) {
    model.addAttribute("url", url);
    model.addAttribute("alias", alias);
    model.addAttribute("message", message);
    return "main";
  }

  @PostMapping("/save-link")
  public String save(@RequestParam(name = "url") String url,
                     @RequestParam(name = "alias") String alias, RedirectAttributes redirectAttributes) {
    if (entryService.alreadyExists(alias)) {
      redirectAttributes.addAttribute("url", url);
      redirectAttributes.addAttribute("alias", alias);
      redirectAttributes.addAttribute("message", "Your alias is already in use!");
    }
    else{
      Entry newEntry = new Entry(url, alias);
      entryService.save(newEntry);
      redirectAttributes.addAttribute("message", "Your URL is aliased to "+ alias +" and your secret code is "+newEntry.getSecretCode()+".");
    }
    return "redirect:/";
  }

  @GetMapping("/a/{alias}")
  public String a(@PathVariable(name = "alias") String alias) {
    try{
      return "redirect:"+entryService.getTheURL(alias);
    } catch (Exception e) {
      return "redirect:/a/error";
    }
  }
}
