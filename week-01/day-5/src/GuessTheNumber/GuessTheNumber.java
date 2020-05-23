package GuessTheNumber;

import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        int num = 8;
        int guess;
        do {
            Scanner scanner = new Scanner(System.in);
            guess = scanner.nextInt();
            if (guess == num) {
                System.out.println("You found the number:" + guess);
            }
            else if (guess < num) {
                System.out.println("The stored number is higher.");
            }
            else {
                System.out.println("The stored number is lower.");
            }
        } while (num != guess);
    }
}
