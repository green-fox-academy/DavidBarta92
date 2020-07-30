package com.greenfox.fox_manager.Services;

import com.greenfox.fox_manager.Model.Task;
import com.greenfox.fox_manager.Repository.ClassRepository;
import com.greenfox.fox_manager.Repository.TaskRepository;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class TaskService {
  @Autowired
  private TaskRepository taskRepository;
  @Autowired
  private StudentService studentService;

  public TaskService(TaskRepository taskRepository) {
    this.taskRepository = taskRepository;
  }

  public List<Task> findAllByName(String name){
    return taskRepository.findAllByName(studentService.findByName(name).getId(), 1 ,10);
  }

  public void addNew(String task, Long id){
    taskRepository.save(new Task(task, id));
  }

  public void addNewByJSON(Task task){
    taskRepository.save(task);
  }

  public void deleteById(Long id){
    taskRepository.deleteById(id);
  }
}
