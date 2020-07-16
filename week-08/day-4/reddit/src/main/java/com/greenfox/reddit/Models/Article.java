package com.greenfox.reddit.Models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Article {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private Long popularity;
  private String title;
  private String content;

  public Article(String t, String c) {
    this.popularity= 0L;
    this.title = t;
    this.content = c;
  }

  public Article() {
    this.popularity= 0L;
    this.title = "Sample text";
    this.content = "Empty article.";
  }

  public void raisePopularity(){
    this.popularity++;
  }

  public void reducePopularity(){
    if(this.popularity > 0){
      this.popularity--;
    }
  }
}
