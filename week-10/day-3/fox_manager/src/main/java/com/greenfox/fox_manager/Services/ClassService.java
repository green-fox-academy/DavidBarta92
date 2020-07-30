package com.greenfox.fox_manager.Services;

import com.greenfox.fox_manager.Repository.ClassRepository;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

@Getter
@Setter
@NoArgsConstructor
public class ClassService {
  @Autowired
  private ClassRepository classRepository;

  public ClassService(ClassRepository classeRepository) {
    this.classRepository = classRepository;
  }
}
