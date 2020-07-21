package com.greenfox.api.Services;

import com.greenfox.api.Models.Entity.Until;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ActionService {
  public ActionService(String action, Until until){
    if(action.contains("sum")){
          int h = 1;
          for(int i = 1; i <= until.getUntil(); i++){
            h = i * h;
          }
    }
    else {
      int h = 1;
      for(int i = 1; i <= until.getUntil(); i++){
        h = i + h;
      }
    }
  }
}
