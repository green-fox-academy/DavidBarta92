package com.greenfox.fox_manager.Controllers;

import com.greenfox.fox_manager.Services.ClassService;
import com.greenfox.fox_manager.Services.StudentService;
import com.greenfox.fox_manager.Services.TaskService;
import com.greenfox.fox_manager.Services.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class MainController {
  private ClassService classService;
  private StudentService studentService;
  private TaskService taskService;
  private TeamService teamService;


  @Autowired
  public MainController(ClassService classService,
                        StudentService studentService,
                        TaskService taskService,
                        TeamService teamService) {
    this.classService = classService;
    this.studentService = studentService;
    this.taskService = taskService;
    this.teamService = teamService;
  }

  @GetMapping("/")
  public String homePage(@RequestParam(value = "name", required = false) String name, Model model) {
    if (name == null) {
      return "redirect:/login";
    } else {
      model.addAttribute("name", name);
      model.addAttribute("tasks", taskService.findAllByName(name));
      return "home";
    }
  }

  @GetMapping("/team")
  public String teamPage(@RequestParam(value = "name", required = false) String name, Model model) {
    if (name == null) {
      return "redirect:/login";
    } else {
      model.addAttribute("name", name);
      return "team";
    }
  }

  @GetMapping("/class")
  public String classPage(@RequestParam(value = "name", required = false) String name, Model model) {
    if (name == null) {
      return "redirect:/login";
    } else {
      model.addAttribute("name", name);
      return "class";
    }
  }

  @GetMapping("/login")
  public String login() {
    return "login";
  }

  @PostMapping("/login")
  public String logging(@RequestParam(value = "name") String name,
                        @RequestParam(value = "password") String password, RedirectAttributes redirectAttributes) {
    if (!studentService.valid(name)) {
      return "login";
    } else {
      redirectAttributes.addAttribute("name", name);
      return "redirect:/";
    }
  }

  @RequestMapping("/edit/{id}")
  public String raise(@PathVariable(name = "id") Long id){ //not finished
    return "redirect:/";
  }

  @RequestMapping("/remove/{id}")
  public String reduce(@PathVariable(name = "id") Long id){
    taskService.deleteById(id);
    return "redirect:/";
  }
}
