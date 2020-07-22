package com.greenfox.api.Repository;

import com.greenfox.api.Models.Entity.Log;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogRepository extends CrudRepository<Log, Long> {
}
