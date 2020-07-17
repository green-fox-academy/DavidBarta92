package com.greenfox.reddit.Models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

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
  @DateTimeFormat(pattern="HH:mm" )
  @Temporal(TemporalType.TIME)
  @Column(nullable = false)
  private Date postTime;

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
