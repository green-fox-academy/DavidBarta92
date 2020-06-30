package labdaNstream;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class exercise7 {
  static List<String> cities = Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS");

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();
    Character firstLetter = input.charAt(0);

    cities.stream()
        .filter(e -> e.charAt(0) == firstLetter)
        .forEach(System.out::println);
  }
}
