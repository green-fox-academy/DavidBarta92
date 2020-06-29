package labdaNstream;

import javax.swing.*;
import java.util.Arrays;
import java.util.List;

public class exercise3 {
  List<Integer> numbers = Arrays.asList(3, 9, 2, 8, 6, 5);

  public static void main(String[] args) {
    numbers.stream()
        .
        .filter(n -> n > 20)
        .forEach(System.out::println);
  }
}
