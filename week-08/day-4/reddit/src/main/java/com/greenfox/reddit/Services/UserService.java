package com.greenfox.reddit.Services;

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
    userRepository.save(new User());
  }

  public boolean includes(String name) {
    Long i = 0L;
    boolean found = false;
    while(!found){
      if(name.compareTo(userRepository.findById(i).get().getName()) == 0){
        found = true;
      }
      else{
        i++;
      }
    }
    return found;
  }

  public User findByName(String name){
    Long i = 0L;
    boolean found = false;
    while(!found){
      if(name.compareTo(userRepository.findById(i).get().getName()) == 0){
        found = true;
      }
      else{
        i++;
      }
    }
    return userRepository.findById(i).get();
  }
}
