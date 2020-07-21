package com.greenfox.api.Models.Entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Doubled {
  private int received;
  private int result;

  public Doubled(int num){
    this.received = num;
    this.result = this.received*2;
  }
}
