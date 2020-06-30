package labdaNstream;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class exercise8 {
  static List<Character> charsOfMyName = Arrays.asList('D','a','v','i','d');
  public static void main(String[] args) {
    String myName = charsOfMyName.stream()
        .map(Objects::toString)
        .collect(Collectors.joining());
    System.out.println(myName);
  }
}
