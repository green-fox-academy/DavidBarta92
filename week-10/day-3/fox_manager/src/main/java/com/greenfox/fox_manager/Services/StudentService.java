package com.greenfox.fox_manager.Services;

import com.greenfox.fox_manager.Model.Student;
import com.greenfox.fox_manager.Repository.ClassRepository;
import com.greenfox.fox_manager.Repository.StudentRepository;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class StudentService {
  @Autowired
  private StudentRepository studentRepository;

  public StudentService(StudentRepository studentRepository) {
    this.studentRepository = studentRepository;
  }

  public void addNew(String name){
    studentRepository.save(new Student(name));
  }

  public Student findByName(String name){
    int i = 1;
    boolean found = false;
    List<Student> students = (List<Student>) studentRepository.findAll();
    while(!found){
      if(name.compareTo(students.get(i-1).getName()) == 0 || i+1 == students.size()){
        found = true;
      }
      else{
        i++;
      }
    }
    return students.get(i-1);
  }

  public boolean valid(String name) {
    if(findByName(name)==null){
      return false;
    }
    else{
      return true;
    }
  }
}
