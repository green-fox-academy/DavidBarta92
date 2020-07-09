package com.greenfox.foxclub.service;

import com.greenfox.foxclub.model.Fox;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class FoxList {
  private final List<Fox> listOfFoxes = new ArrayList<Fox>();

  public FoxList(){
    this.listOfFoxes.add(new Fox("MrFox"));
  }

  public void addNewFoxToTheClub(Fox newFox){
    listOfFoxes.add(newFox);
  }

  public Fox getFoxByIndex(Integer index){
    return listOfFoxes.get(index);
  }

  public Fox getTheLastFox(){
    return listOfFoxes.get(listOfFoxes.size()-1);
  }

  public List getTheList(){
    return listOfFoxes;
  }

  public Fox getTheFox(String name){
    Fox calledFox = listOfFoxes.stream()
        .filter(n -> Objects.equals(n.getName(), name))
        .collect(Collectors.toList()).get(0);
    return calledFox;
  }
}
