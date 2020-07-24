package com.greenfox.url_aliaser.Model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Entry {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String url;
  private String alias;
  private int secretCode;
  private int hitCount;

  public Entry(String url, String alias){
    this.url = url;
    this.alias = alias;
    this.setSecretCode();
    this.hitCount = 0;
  }

  public void setSecretCode() {
    double code = Math.random() * ((9999 - 1000) + 1)+1000;
    this.secretCode = (int)Math.round(code);
  }
}
