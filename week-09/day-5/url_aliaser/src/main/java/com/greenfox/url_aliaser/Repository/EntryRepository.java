package com.greenfox.url_aliaser.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import sun.rmi.runtime.Log;

@Repository
public interface EntryRepository extends CrudRepository<Log, Long> {
}
