package com.greenfox.sql_connect.Repository;

import com.greenfox.sql_connect.Model.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Long> {

}
