package com.greenfox.reddit.Services;

public interface ArticalServiceInterface {
  void raise(Long id);
  void reduce(Long id);
  void addNew(String title, String content);
}
