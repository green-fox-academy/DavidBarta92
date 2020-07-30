package com.greenfox.fox_manager.Model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Status {
  private String message;
  private int statusCode;

  public Status(String message, int statusCode){
    this.message = message;
    this.statusCode = statusCode;
  }
}
