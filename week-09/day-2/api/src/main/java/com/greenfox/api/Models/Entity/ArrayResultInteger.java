package com.greenfox.api.Models.Entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ArrayResultInteger implements ArrayResult{
  private int result;

  public ArrayResultInteger(OperationArray OpAr){
    int result = 0;
      if(OpAr.getWhat().compareTo("sum") == 0){
        for(int i = 0; i < OpAr.getNumbers().size(); i++) {
          result = OpAr.getNumbers().get(i) + result;
        }
      }
      if(OpAr.getWhat().compareTo("multiply") == 0){
        result = 1;
        for(int i = 0; i < OpAr.getNumbers().size(); i++) {
          result = OpAr.getNumbers().get(i) * result;
        }
      }
    this.result = result;
  }
}
