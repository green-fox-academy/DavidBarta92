package com.greenfox.url_aliaser;

import com.greenfox.url_aliaser.Service.EntryService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class UrlAliaserApplication {

  public static void main(String[] args) {
    SpringApplication.run(UrlAliaserApplication.class, args);
  }

  @Bean
  EntryService articleService(){
    return new EntryService();
  }

}
