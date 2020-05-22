package AverageOfInput;

import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {
        System.out.print("Type 5 numbers! ");
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for (short i = 0; i < 5; i++) {
            int input = scanner.nextInt();
            sum = sum + input;
        }
        float average = sum/5;
        System.out.println("The sum of numbers: " + sum);
        System.out.println("The average of numbers: " + average);
    }
}
