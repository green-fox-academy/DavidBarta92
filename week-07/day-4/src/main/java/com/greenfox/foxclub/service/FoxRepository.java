package com.greenfox.foxclub.service;

import com.greenfox.foxclub.model.Fox;
import org.springframework.data.repository.CrudRepository;

public interface FoxRepository extends CrudRepository<Fox, Long> {
}
