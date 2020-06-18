package randomtest;

import java.util.Random;

public class RandomTest {
  public static void main(String[] args) {
    Random random = new Random();
    int randomNum = 0;
    while (randomNum != 8) {
      randomNum = 1 + random.nextInt(7);
      System.out.println(randomNum);
    }
  }
}
