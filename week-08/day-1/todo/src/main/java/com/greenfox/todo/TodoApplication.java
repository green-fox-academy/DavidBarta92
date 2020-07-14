package com.greenfox.todo;

import com.greenfox.todo.Model.Todo;
import com.greenfox.todo.Repository.TodoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.json.GsonBuilderUtils;

@SpringBootApplication
public class TodoApplication {

  public static void main(String[] args) {
    SpringApplication.run(TodoApplication.class, args);
  }

    @Bean
    public CommandLineRunner todoDB(TodoRepository todoRepository) {
        return args -> {
       };
   }
}
