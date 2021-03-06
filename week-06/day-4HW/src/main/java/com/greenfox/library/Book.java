package com.greenfox.library;

public class Book {
  private static int nextId = 0;

  private int id;
  private String title;
  private String author;
  private Integer releaseYear;

  public Book(String title, String author, Integer releaseYear) {
    this.id = nextId++;
    this.title = title;
    this.author = author;
    this.releaseYear = releaseYear;
    nextId++;
  }

  public int getId(){
    return this.id;
  }

  public String getTitle(){
    return this.title;
  }

  public String getAuthor(){
    return this.author;
  }

  public Integer getReleaseYear(){
    return this.releaseYear;
  }

  public void setTitle(String title){
    this.title = title;
  }

  public void setAuthor(String author){
    this.author = author;
  }
}
