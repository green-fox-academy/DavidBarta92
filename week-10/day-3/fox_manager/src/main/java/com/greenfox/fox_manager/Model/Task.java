package com.greenfox.fox_manager.Model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Task {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String task;
  private String dueDate;
  private int priorityLevel;
  private Long studentId;
  private Long teamid;

  public Task(String task, String dueDate, int priorityLevel, Student student, Team team){
    this.task = task;
    this.dueDate = dueDate;
    this.priorityLevel = priorityLevel;
    this.studentId = student.getId();
    this.teamid = team.getId();
  }

  public Task(String task, Long idOfStudent){
    this.task = task;
    this.studentId = idOfStudent;
  }

  public Task(String task, String dueDate, int priorityLevel){
    this.task = task;
    this.dueDate = dueDate;
    this.priorityLevel = priorityLevel;
  }
}
