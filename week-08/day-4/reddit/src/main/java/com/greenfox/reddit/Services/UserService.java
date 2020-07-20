package com.greenfox.reddit.Services;

import com.greenfox.reddit.Models.Article;
import com.greenfox.reddit.Models.User;
import com.greenfox.reddit.Repository.UserRepository;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

@Getter
@Setter
@NoArgsConstructor
public class UserService {
  @Autowired
  private UserRepository userRepository;

  public UserService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public void addNew(String title, String content){
    userRepository.save(new Article(title, content));
  }

  public boolean includes(String name) {
    userRepository.
    return ;
  }

  public User findByName(String name){
    for(){
      userRepository.findById();
    }
    return ;
  }
}
