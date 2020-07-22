package com.greenfox.api.Services;

import com.greenfox.api.Models.Entity.ArrayResult;
import com.greenfox.api.Models.Entity.ArrayResultInteger;
import com.greenfox.api.Models.Entity.ArrayResultList;
import com.greenfox.api.Models.Entity.OperationArray;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class OperationArrayProcess {

  public ArrayResult operationService(OperationArray OpAr){
    if(OpAr.getWhat().compareTo("sum") == 0){
      return new ArrayResultInteger(OpAr);
    }
    if(OpAr.getWhat().compareTo("multiply") == 0){
      return new ArrayResultInteger(OpAr);
    }
    if(OpAr.getWhat().compareTo("double") == 0){
      return new ArrayResultList(OpAr);
    }
    return null;
  }
}
