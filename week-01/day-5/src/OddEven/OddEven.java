package OddEven;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        boolean odd = 1 == (input % 2);
        if (odd) {
            System.out.println("Odd");
        }
        else {
            System.out.println("Even");
        }
    }
}
