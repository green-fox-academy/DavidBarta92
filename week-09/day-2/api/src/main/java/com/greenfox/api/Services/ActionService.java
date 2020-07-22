package com.greenfox.api.Services;

import com.greenfox.api.Models.Entity.Until;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ActionService {
  private int result;

  public ActionService(String action, Until until){
    int h = 1;
    if(action.contains("sum")){
          for(int i = 1; i <= until.getUntil(); i++){
            h = i + h;
          }
          h--;
    }
    else {
      for(int i = 1; i <= until.getUntil(); i++){
        h = i * h;
      }
    }
    this.result = h;
  }
}
