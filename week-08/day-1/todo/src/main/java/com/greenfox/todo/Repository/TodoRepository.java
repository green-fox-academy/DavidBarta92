package com.greenfox.todo.Repository;

import com.greenfox.todo.Model.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Long> {


}
