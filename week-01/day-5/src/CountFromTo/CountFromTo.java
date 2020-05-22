package CountFromTo;

import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        if (num1 > num2) {
            System.out.println("The second number should be bigger.");
        }
        else {
            int distance = num2 - num1;
            for (int i = distance; i > 0; i--) {
                System.out.println(num1);
                num1 ++;
            }
        }
    }
}
