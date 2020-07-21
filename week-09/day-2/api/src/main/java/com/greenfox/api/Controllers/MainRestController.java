package com.greenfox.api.Controllers;

import com.greenfox.api.Models.DTO.ErrorMessage;
import com.greenfox.api.Models.Entity.*;
import com.greenfox.api.Services.ActionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RestController
public class MainRestController {

  @GetMapping(value = "/doubling")
  public ResponseEntity<?> doubling(@RequestParam(name = "input", required = false) Integer number){
    try {
      return ResponseEntity.status(200).body(new Doubled(number));
    }
    catch(Exception e400){
      return ResponseEntity.status(200).body(new ErrorMessage("Please provide an input!"));
    }
  }

  @GetMapping(value = "/greeter")
  public ResponseEntity<?> greeter(@RequestParam(name = "name", required = false) String name,
                                   @RequestParam(name = "title", required = false) String title){
    if (name == null && title == null) {
      return ResponseEntity.status(400).body(new ErrorMessage("Please provide a name and a title!"));
    }
    else if(name == null){
      return ResponseEntity.status(400).body(new ErrorMessage("Please provide a name!"));
    }
    else if(title == null){
      return ResponseEntity.status(400).body(new ErrorMessage("Please provide a title!"));
    }
    else{
      return ResponseEntity.status(200).body(new Greeter(name, title));
    }
  }

  @GetMapping(value = "/appenda/{appendable}")
  public ResponseEntity<?> appendA(@PathVariable("appendable") String appendable){
    if (appendable == null) {
      return ResponseEntity.status(404).body("");
    }
    else{
      return ResponseEntity.status(200).body(new Appender(appendable));
    }
  }

  @PostMapping(value = "/dountil/{action}")
  public ResponseEntity<?> appendA(@PathVariable("action") String action,
                                   @RequestBody Until until){
    if (until == null) {
      return ResponseEntity.status(404).body(new ErrorMessage("Please provide a number!"));
    }
    else if (action == null) {
      return ResponseEntity.status(404).body(new ErrorMessage("There is no action."));
    }
    else{
      return ResponseEntity.status(200).body(new ActionService(action, until));
    }
  }
}
