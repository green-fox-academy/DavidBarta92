package com.greenfox.reddit.Controllers;

import com.greenfox.reddit.Services.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {
  private ArticleService articleService;

  @Autowired
  public MainController(ArticleService articleService) {
    this.articleService = articleService;
  }

  @RequestMapping("/")
  public String list(Model model){
    model.addAttribute("articles", articleService.findAllOrderByPopularity(1,10));
    return "index";
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

}
