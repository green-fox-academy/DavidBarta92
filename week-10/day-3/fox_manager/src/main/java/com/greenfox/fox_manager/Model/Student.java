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
public class Student {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;
  private Long teamId;
  private Long classId;

  public Student(String name, Team team, Class className){
    this.name = name;
    this.teamId = team.getId();
    this.classId = className.getId();
  }

  public Student(String name){
    this.name = name;
  }
}
