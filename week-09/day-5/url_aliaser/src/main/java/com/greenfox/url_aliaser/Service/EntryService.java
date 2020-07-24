package com.greenfox.url_aliaser.Service;

import com.greenfox.url_aliaser.Model.Entry;
import com.greenfox.url_aliaser.Repository.EntryRepository;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Getter
@Setter
@NoArgsConstructor
public class EntryService {
  @Autowired
  private EntryRepository entryRepository;

  public EntryService(EntryRepository entryRepository) {
    this.entryRepository = entryRepository;
  }

  public boolean alreadyExists(String alias) {
    Long i = 0L;
    boolean found = false;
    while(!found){
      if(alias.compareTo(entryRepository.findById(i).get().getAlias()) == 0){
        found = true;
      }
      else{
        i++;
      }
    }
    return found;
  }

  public void save(Entry newEntry){
    entryRepository.save(newEntry);
  }
}
