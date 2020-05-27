package DivideByZero;

import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {
        Scanner userNum = new Scanner(System.in);
        int num = userNum.nextInt();
        try {
            System.out.println(divisor(num));
        } catch (ArithmeticException e) {
            System.out.println("fail");
        }
    }
    public static int divisor(int num){
    int result =10 /num;
    return result;
    }
}
