package com.greenfox.reddit.Controllers;

import com.greenfox.reddit.Services.ArticleService;
import com.greenfox.reddit.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {
  private ArticleService articleService;
  private UserService userService;

  @Autowired
  public MainController(ArticleService articleService) {
    this.articleService = articleService;
  }

  @RequestMapping("/")
  public String list(@PathVariable(name = "id", required = false) Long id, Model model){
    model.addAttribute("articles", articleService.findAllOrderByPopularity(1,10));
    if(id == null){
      return "login";
    }
    else{
      return "index";
    }
  }

  @RequestMapping("/raise/{id}")
  public String raise(@PathVariable(name = "id") Long id){
    articleService.raise(id);
    return "redirect:/";
  }

  @RequestMapping("/reduce/{id}")
  public String reduce(@PathVariable(name = "id") Long id){
    articleService.reduce(id);
    return "redirect:/";
  }

  @RequestMapping("/write")
  public String write(){
    return "write";
  }

  @PostMapping("/add")
  public String add(@RequestParam(value = "title") String title,
                    @RequestParam(value = "content") String content){
    articleService.addNew(title, content);
    return "redirect:/";
  }

  @RequestMapping("/login")
  public String login(){
    return "login";
  }

  @PostMapping("/loggingin")
  public String loggingin(@RequestParam(value = "name") String userName,
                          @RequestParam(value = "password") String userPassword){
    if(userService.includes(userName) && userService.findByName(userName).getPassword().equals(userPassword)){
      return "redirect:/";
    }
    else{
      return "/";
    }
  }

  @RequestMapping("/register")
  public String register(){
    return "register";
  }

  @PostMapping("/registrate")
  public String registrate(@RequestParam(value = "name") String title,
                           @RequestParam(value = "password") String password,
                           @RequestParam(value = "passwordAgain") String passwordAgain){
    if(password == passwordAgain){
      userService.addNew(title, password);
      return "redirect:/";
    }
    else{
      return "redirect:/register";
    }
  }

}
