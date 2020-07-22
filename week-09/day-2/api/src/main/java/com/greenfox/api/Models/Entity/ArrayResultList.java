package com.greenfox.api.Models.Entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
@NoArgsConstructor
public class ArrayResultList implements ArrayResult{
  private ArrayList result;

  public ArrayResultList(OperationArray OpAr){
    ArrayList<Integer> result = new ArrayList<>();
    for(int i = 0; i < OpAr.getNumbers().size(); i++){
      if(OpAr.getWhat().compareTo("double") == 0){
        result.add(OpAr.getNumbers().get(i)*2);
      }
    }
    this.result = result;
  }
}
