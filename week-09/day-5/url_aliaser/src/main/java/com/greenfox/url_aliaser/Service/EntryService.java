package com.greenfox.url_aliaser.Service;

import com.greenfox.url_aliaser.Model.Entry;
import com.greenfox.url_aliaser.Repository.EntryRepository;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
    int i = 1;
    boolean found = false;
    List<Entry> entries = (List<Entry>) entryRepository.findAll();
    while(!found){
      if(alias.compareTo(entries.get(i).getAlias()) == 0){
        found = true;
        return true;
      }
      if(i+1 == entries.size()){
        found = true;
        return false;
      }
      else{
        i++;
      }
    }
    return false;
  }

  public void save(Entry newEntry){
    entryRepository.save(newEntry);
  }

  public String getTheURL(String alias){
    int i = 1;
    boolean found = false;
    List<Entry> entries = (List<Entry>) entryRepository.findAll();
    while(!found){
      if(alias.compareTo(entries.get(i).getAlias()) == 0 || i+1 == entries.size()){
        found = true;
      }
      else{
        i++;
      }
    }
    return entries.get(i).getUrl();
  }

  public List<Entry> getAll(){
    List<Entry> allElementsOfEntryRepo = (List<Entry>) entryRepository.findAll();
    return allElementsOfEntryRepo;
  }
}
