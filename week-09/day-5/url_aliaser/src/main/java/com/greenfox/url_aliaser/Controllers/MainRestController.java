package com.greenfox.url_aliaser.Controllers;

import com.greenfox.url_aliaser.Model.LinkReport;
import com.greenfox.url_aliaser.Service.EntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainRestController {

  @Autowired
  private EntryService entryService;

  @GetMapping(value = "/a/error")
  public ResponseEntity<?> aError() {
    return ResponseEntity.status(404).body("");
  }

  @GetMapping(value = "/api/links")
  public ResponseEntity<?> links() {
    try {
      return ResponseEntity.status(200).body(new LinkReport(entryService.getAll()));
    }
    catch(Exception e400){
      return ResponseEntity.status(500).body("Please provide an input!");
    }
  }

  @DeleteMapping("/api/links/{id}")
  public ResponseEntity<?> delete(@PathVariable(name = "id") Long id,
                                  @RequestBody int code) {
    if(entryService.findById(id).get() == null){
      return ResponseEntity.status(404).body("");
    }
    else if (entryService.findById(id).get().getSecretCode() != code){
      return ResponseEntity.status(403).body("");
    }
    else{
      entryService.deleteById(id);
      return ResponseEntity.status(204).body("");
    }
  }
}
