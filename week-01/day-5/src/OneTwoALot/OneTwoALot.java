package OneTwoALot;

import java.util.Scanner;

public class OneTwoALot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        boolean notEnough = 0 >= input;
        boolean one = 1 == input;
        boolean two = 2 == input;
        boolean aLot = 2 < input;

        if (notEnough) {
            System.out.println("It's not enough!");
        }
        if (one) {
            System.out.println("One");
        }
        if (two) {
            System.out.println("Two");
        }
        if (aLot) {
            System.out.println("A lot");
        }
    }
}
