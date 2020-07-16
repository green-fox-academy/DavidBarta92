package com.greenfox.reddit.Controllers;

import com.greenfox.reddit.Models.Article;
import com.greenfox.reddit.Repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
  private ArticleRepository articleRepository;

  @Autowired
  public MainController(ArticleRepository articleRepository) {
    this.articleRepository = articleRepository;
  }

  @RequestMapping("/")
  public String list(Model model){
    model.addAttribute("articles", articleRepository.findAll());
    return "index";
  }

  @RequestMapping("/raise/{art.id}")
  public String raise(@ModelAttribute(name = "Raise") Article article){
    article.raisePopularity();
    articleRepository.save(article);
    return "redirect:/";
  }

  @RequestMapping("/reduce/{art.id}")
  public String reduce(@ModelAttribute(name = "Reduce") Article article){
    article.reducePopularity();
    articleRepository.save(article);
    return "redirect:/";
  }

  @RequestMapping("/write")
  public String write(){
    return "write";
  }

  @RequestMapping("/read/{art.id}")
  public String read(@PathVariable(name = "id") Long id, Model model){
    model.addAttribute("articles", articleRepository.findById(id));
    return "read";
  }
}
