package com.greenfox.api.Models.Entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Sith {
  private String text;

  public Sith(Sith sith){
    this.text = sith.getText();
  }
}
