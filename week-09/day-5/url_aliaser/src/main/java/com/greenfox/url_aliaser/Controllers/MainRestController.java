package com.greenfox.url_aliaser.Controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
public class MainRestController {

  @GetMapping(value = "/api/links")
  public ResponseEntity<?> links() {
    try {
      //return ResponseEntity.status(200).body(new LogReport(logService.getAll(), logService.getAll().size()));
    } catch (Exception e400) {
      //return ResponseEntity.status(500).body(new ErrorMessage("Please provide an input!"));
    }
    return null;
  }

  @DeleteMapping("/api/links/{id}")
  public String delete(@PathVariable(name = "id") Long id) {
    
    return null;
  }
}
