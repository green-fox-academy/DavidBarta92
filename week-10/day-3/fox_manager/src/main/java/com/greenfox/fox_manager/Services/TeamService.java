package com.greenfox.fox_manager.Services;

import com.greenfox.fox_manager.Repository.ClassRepository;
import com.greenfox.fox_manager.Repository.TeamRepository;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

@Getter
@Setter
@NoArgsConstructor
public class TeamService {
  @Autowired
  private TeamRepository teamRepository;

  public TeamService(TeamRepository teamRepository) {
    this.teamRepository = teamRepository;
  }
}
