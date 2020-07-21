package com.greenfox.api.Models.Entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Greeter {
  private String welcome_message;

  public Greeter(String name, String title){
    StringBuilder message = new StringBuilder();
    message.append("Oh, hi there ");
    message.append(name);
    message.append(", my dear ");
    message.append(title);
    message.append("!");
    this.welcome_message = message.toString();
  }
}
