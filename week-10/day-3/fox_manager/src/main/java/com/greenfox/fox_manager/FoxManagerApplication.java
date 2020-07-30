package com.greenfox.fox_manager;

import com.greenfox.fox_manager.Model.Class;
import com.greenfox.fox_manager.Services.ClassService;
import com.greenfox.fox_manager.Services.StudentService;
import com.greenfox.fox_manager.Services.TaskService;
import com.greenfox.fox_manager.Services.TeamService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FoxManagerApplication {

  public static void main(String[] args) {
    SpringApplication.run(FoxManagerApplication.class, args);
  }

  @Bean
  public CommandLineRunner foxManager(ClassService classService, StudentService studentService, TaskService taskService, TeamService teamService) {
    return args -> {
      studentService.addNew("David");
      taskService.addNew("Feed the beast", 1L);
    };
  }

  @Bean
  ClassService classService() {
    return new ClassService();
  }

  @Bean
  StudentService studentService() {
    return new StudentService();
  }

  @Bean
  TaskService taskService() {
    return new TaskService();
  }

  @Bean
  TeamService teamService() {
    return new TeamService();
  }
}
