package com.greenfox.fox_manager.Repository;

import com.greenfox.fox_manager.Model.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Long> {
}
