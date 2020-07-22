package com.greenfox.api.Models.Entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
@NoArgsConstructor
public class OperationArray {
  private String what;
  private ArrayList<Integer> numbers;
}
