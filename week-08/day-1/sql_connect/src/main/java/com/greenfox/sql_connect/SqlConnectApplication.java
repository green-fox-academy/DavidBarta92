package com.greenfox.sql_connect;

import com.greenfox.sql_connect.Model.Todo;
import com.greenfox.sql_connect.Repository.TodoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SqlConnectApplication {

  public static void main(String[] args) {
    SpringApplication.run(SqlConnectApplication.class, args);
  }

  @Bean
  public CommandLineRunner todoDB(TodoRepository todoRepository) {
    return args -> {
      todoRepository.save(new Todo("Play games" , false, false));
      todoRepository.save(new Todo("Learn code", true, false));
      todoRepository.save(new Todo("Do something", false, true));
      todoRepository.save(new Todo("Sleep", true, false));
      todoRepository.save(new Todo("Call your mom", false, true));
      todoRepository.save(new Todo("Prepare food", false, false));
    };
  }
}
