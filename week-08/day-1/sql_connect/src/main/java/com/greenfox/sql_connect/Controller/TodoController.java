package com.greenfox.sql_connect.Controller;

import com.greenfox.sql_connect.Model.Todo;
import com.greenfox.sql_connect.Repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

  @GetMapping("/delete/{id}")
  public String delete(@PathVariable(name = "id") Long id){
    todoRepository.deleteById(id);
    return "redirect:/todo/list";
  }

  @GetMapping("/update/{id}")
  public String editpage(@PathVariable(name = "id") Long id, Model model){
    todoRepository.findById(id);
    model.addAttribute("todo", todoRepository.findById(id).orElse(null));
    return "editpage";
  }

  @PostMapping("/edit")
  public String edit(@ModelAttribute(name = "todo") Todo todo){
    todoRepository.save(todo); // not works
    return "redirect:/todo/list";
  }
}