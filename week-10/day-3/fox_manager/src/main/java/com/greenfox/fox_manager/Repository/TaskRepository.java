package com.greenfox.fox_manager.Repository;

import com.greenfox.fox_manager.Model.Task;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TaskRepository extends CrudRepository<Task, Long> {
  @Query(value = "SELECT * FROM task WHERE student_id = id ORDER BY priority_Level DESC LIMIT 10", nativeQuery = true)
  List<Task> findAllByName(Long id, int from, int to);
}
