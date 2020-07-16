package com.greenfox.reddit.Controllers;

import com.greenfox.reddit.Models.Article;
import com.greenfox.reddit.Repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {
  private ArticleRepository articleRepository;

  @Autowired
  public MainController(ArticleRepository articleRepository) {
    this.articleRepository = articleRepository;
  }

  @RequestMapping("/")
  public String list(Model model){
    model.addAttribute("articles", articleRepository.findAllOrderByPopularity(1,100));
    return "index";
  }

  @RequestMapping("/raise/{id}")
  public String raise(@PathVariable(name = "id") Long id){
    Article article = articleRepository.findById(id).orElse(null);
    article.raisePopularity();
    articleRepository.save(article);
    return "redirect:/";
  }

  @RequestMapping("/reduce/{id}")
  public String reduce(@PathVariable(name = "id") Long id){
    Article article = articleRepository.findById(id).orElse(null);
    article.reducePopularity();
    articleRepository.save(article);
    return "redirect:/";
  }

  @RequestMapping("/write")
  public String write(){
    return "write";
  }

  @PostMapping("/add")
  public String add(@RequestParam(value = "title") String title,
                      @RequestParam(value = "content") String content){
    articleRepository.save(new Article(title, content));
    return "redirect:/";
  }


}
