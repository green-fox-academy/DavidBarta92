package PrintEven;

import java.util.Scanner;

public class PrintEven {
    public static void main(String[] args) {
        for (short i = 1; i < 500; i++){
            boolean odd = 1 == (i % 2);
            if (!odd) {
                System.out.println(i);
            };
        }
    }

}
