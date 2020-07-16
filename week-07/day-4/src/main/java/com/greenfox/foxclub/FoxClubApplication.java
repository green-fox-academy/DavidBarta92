package com.greenfox.foxclub;

import com.greenfox.foxclub.service.FoxList;
import com.greenfox.foxclub.service.FoxRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FoxClubApplication {
  public static void main(String[] args) {
    SpringApplication.run(FoxClubApplication.class, args);
  }

  @Bean
  public CommandLineRunner todoDB(FoxRepository foxRepository) {
    return args -> {
    };
  }
}
