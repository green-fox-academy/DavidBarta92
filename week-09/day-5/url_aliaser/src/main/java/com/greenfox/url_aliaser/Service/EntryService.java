package com.greenfox.url_aliaser.Service;

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

}
