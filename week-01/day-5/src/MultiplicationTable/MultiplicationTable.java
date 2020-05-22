package MultiplicationTable;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for (byte i = 1; i <= 10; i++) {
            int result = i * num;
            System.out.println(i +" * " + num + " = " + result);
        }
    }
}
