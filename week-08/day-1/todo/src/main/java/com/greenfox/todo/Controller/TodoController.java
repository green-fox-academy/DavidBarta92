package com.greenfox.todo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller("/todo")
public class TodoController {

  @RequestMapping("/")
  @ResponseBody
  public String main(){
    return "index";
  }

  @RequestMapping("/list")
  @ResponseBody
  public String list(){
    return "This is my first Todo";
  }
}
