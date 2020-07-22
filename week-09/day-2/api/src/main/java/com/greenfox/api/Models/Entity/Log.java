package com.greenfox.api.Models.Entity;

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
public class Log {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private Date createdAt;
  private String endpoint;
  private String data;

  public Log(Date createdAt, String endpoint, String data){
    this.createdAt = createdAt;
    this.endpoint = endpoint;
    this.data = data;
  }
}
