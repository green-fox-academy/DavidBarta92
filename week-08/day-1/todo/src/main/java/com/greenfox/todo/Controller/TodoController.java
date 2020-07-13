package com.greenfox.todo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/todo")
public class TodoController {

  @GetMapping(value={"/","/list"})
  public String list(Model model){
    return "todolist";
  }
}
