package labdaNstream;

import java.util.Arrays;
import java.util.List;

public class exercise2 {
  static List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);

  public static void main(String[] args) {
    numbers.stream()
        .filter(n -> n > 0)
        .forEach(n -> System.out.println(n * n));
  }
}
