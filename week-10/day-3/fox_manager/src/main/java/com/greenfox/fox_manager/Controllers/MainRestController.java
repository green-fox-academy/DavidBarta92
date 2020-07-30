package com.greenfox.fox_manager.Controllers;

import com.greenfox.fox_manager.Model.Status;
import com.greenfox.fox_manager.Model.Task;
import com.greenfox.fox_manager.Services.ClassService;
import com.greenfox.fox_manager.Services.StudentService;
import com.greenfox.fox_manager.Services.TaskService;
import com.greenfox.fox_manager.Services.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainRestController {
  private ClassService classService;
  private StudentService studentService;
  private TaskService taskService;
  private TeamService teamService;


  @Autowired
  public MainRestController(ClassService classService,
                        StudentService studentService,
                        TaskService taskService,
                        TeamService teamService) {
    this.classService = classService;
    this.studentService = studentService;
    this.taskService = taskService;
    this.teamService = teamService;
  }

  @PostMapping("/add")
  public ResponseEntity<?> add(@RequestBody Task task){
    if (task == null) {
      return ResponseEntity.status(400).body(new Status("There is no element to process.", 400));
    }
    else{
      taskService.addNewByJSON(task);
      return ResponseEntity.status(200).body(new Status("ok", 200));
    }
  }

}
