package ParametricAverage;

import java.util.Scanner;

public class ParametricAverage {
    public static void main(String[] args) {
        int sum = 0;
        int temp = 0;
        int x = 0;
        do {
            temp = sum;
            Scanner scanner = new Scanner(System.in);
            sum = sum + scanner.nextInt();
            x++;
            double average = sum / x;
            System.out.print("Sum: " + sum);
            System.out.println(", Average: " + average);
        } while (temp != sum);
    }
}
