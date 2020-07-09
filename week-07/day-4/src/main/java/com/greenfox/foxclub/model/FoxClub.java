package com.greenfox.foxclub.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class FoxClub {
  private static List<Fox> lisOfFoxes = new ArrayList<Fox>(Arrays.asList(new Fox("Karak")));

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
