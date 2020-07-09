package com.greenfox.foxclub.service;

import com.greenfox.foxclub.model.Fox;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FoxList {
  private static List<Fox> lisOfFoxes = new ArrayList<Fox>(Arrays.asList(new Fox("Karak")));

  public FoxList(){
  }

  public static void addNewFoxToTheClub(Fox newFox){
    lisOfFoxes.add(newFox);
  }

  public static Fox getFoxByIndex(Integer index){
    return lisOfFoxes.get(index);
  }

  public static Fox getTheLastFox(){
    return lisOfFoxes.get(lisOfFoxes.size()-1);
  }
}
