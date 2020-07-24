package com.greenfox.url_aliaser.Repository;

import com.greenfox.url_aliaser.Model.Entry;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import sun.rmi.runtime.Log;

@Repository
public interface EntryRepository extends CrudRepository<Entry, Long> {

}
