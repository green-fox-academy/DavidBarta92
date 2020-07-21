package com.greenfox.api.Models.Entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Appender {
  private String appended;

public Appender(String appendable){
  StringBuilder append = new StringBuilder();
  append.append(appendable);
  append.append("a");
  this.appended = append.toString();
}
}
