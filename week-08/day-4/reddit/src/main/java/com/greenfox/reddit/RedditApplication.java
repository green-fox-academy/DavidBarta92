package com.greenfox.reddit;

import com.greenfox.reddit.Models.Article;
import com.greenfox.reddit.Repository.ArticleRepository;
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
  public CommandLineRunner todoDB(ArticleRepository articleRepository) {
    return args -> {
    };
  }
}
