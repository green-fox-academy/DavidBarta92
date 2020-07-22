package com.greenfox.api.Services;

import com.greenfox.api.Models.Entity.Log;
import com.greenfox.api.Repository.LogRepository;
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
public class LogService {
  @Autowired
  private LogRepository logRepository;

  public LogService(LogRepository logRepository) {
    this.logRepository = logRepository;
  }

  public void save(Log newLog){
    logRepository.save(newLog);
  }

  public List<Log> getAll(){
    List<Log> allElementsOfLogRepo = (List<Log>) logRepository.findAll();
    return allElementsOfLogRepo;
  }
}
