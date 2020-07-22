package com.greenfox.api.Controllers;

import com.greenfox.api.Models.DTO.ErrorMessage;
import com.greenfox.api.Models.Entity.*;
import com.greenfox.api.Services.ActionService;
import com.greenfox.api.Services.LogService;
import com.greenfox.api.Services.OperationArrayProcess;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
public class MainRestController {

  @Autowired
  private LogService logService;

  @GetMapping(value = "/doubling")
  public ResponseEntity<?> doubling(@RequestParam(name = "input", required = false) Integer number){
    logService.save(new Log(new Date(), "/doubling", "input="+number));
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
    logService.save(new Log(new Date(), "/greeter", "name=" + name + ", title=" + title));
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
    logService.save(new Log(new Date(), "/appenda/{appendable}", "appendable=" + appendable));
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
    logService.save(new Log(new Date(), "/dountil/{action}", "action=" + action + ", until=" + until.getUntil()));
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

  @PostMapping(value = "/arrays")
  public ResponseEntity<?> appendA(@RequestBody OperationArray OpAr){
    logService.save(new Log(new Date(), "/arrays", "what=" + OpAr.getWhat() + ", numbers=" + OpAr.getNumbers()));
    if (OpAr == null) {
      return ResponseEntity.status(404).body(new ErrorMessage("There is no element to process."));
    }
    else{
      return ResponseEntity.status(200).body(new OperationArrayProcess().operationService(OpAr));
    }
  }

  @GetMapping(value = "/log")
  public ResponseEntity<?> log(){
    try {
      return ResponseEntity.status(200).body(new LogReport(logService.getAll(), logService.getAll().size()));
    }
    catch(Exception e400){
      return ResponseEntity.status(500).body(new ErrorMessage("Please provide an input!"));
    }
  }

  @PostMapping(value = "/sith")
  public ResponseEntity<?> appendA(@RequestBody Sith sith){
    logService.save(new Log(new Date(), "/sith", sith.getText()));
    if (sith == null) {
      return ResponseEntity.status(404).body(new ErrorMessage("Feed me some text you have to, padawan young you are. Hmmm."));
    }
    else{
      return ResponseEntity.status(200).body(new Sith(sith));
    }
  }
}
