package PrintBigger;

import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int input2 = scanner.nextInt();

        if ((input - input2) > 0){
            System.out.println(input);
        }
        else {
            System.out.println(input2);
        };
    }
}
