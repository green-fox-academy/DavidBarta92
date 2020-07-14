package com.greenfox.sql_connect.Controller;

import com.greenfox.sql_connect.Model.Todo;
import com.greenfox.sql_connect.Repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/todo")
public class TodoController {

  TodoRepository todoRepository;

  @Autowired
  public TodoController(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  @RequestMapping(value={"/","/list"})
  public String list(Model model){
    model.addAttribute("todos", todoRepository.findAll());
    return "todolist";
  }

  @PostMapping("/add")
  public String addNew(@RequestParam(value = "new") String newtitle){
    todoRepository.save(new Todo(newtitle , false, false));
    return "redirect:/todo/list";
  }

  @PostMapping("/delete")
  public String delete(@RequestParam Integer id){
    return "redirect:/todo/list";
  }
}