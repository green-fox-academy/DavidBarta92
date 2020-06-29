package labdaNstream;

import java.util.stream.Stream;

public class exercise6 {
  static String name = "BartaDavid";

  public static void main(String[] args) {
    Stream<Character> result = name.chars().mapToObj(c -> (char) c);
    result.filter(c -> c.isUpperCase(c)).forEach(System.out::println);
  }
}
