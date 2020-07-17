package com.greenfox.reddit;

import com.greenfox.reddit.Models.Article;
import com.greenfox.reddit.Repository.ArticleRepository;
import com.greenfox.reddit.Services.ArticleService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RedditApplication {

  public static void main(String[] args) {
    SpringApplication.run(RedditApplication.class, args);
  }

  @Bean
  public CommandLineRunner reddit(ArticleService articleService) {
    return args -> {
    };
  }

  @Bean
  ArticleService articleService(){
    return new ArticleService();
  }
}
