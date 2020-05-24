package DrawDiagonal;

import java.util.Scanner;

public class DrawDiagonal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        for (int i = 1; i <= num; i++){
            System.out.print("%");
        }
        System.out.println();
        for (int i = 0; i < (num - 2); i++){
            System.out.print("%");
            if (i % 3 == 0){
                for (int j = 0; j < (num - 2) / 3; j++)
                    System.out.print("%  ");
            }else if (i % 3 == 1){
                for (int j = 0; j < (num - 2) / 3; j++)
                    System.out.print(" % ");
            }else {
                for (int j = 0; j < (num - 2) / 3; j++)
                    System.out.print("  %");
            }
            if (num % 3 == 0){
                if (i % 3 != 0) {
                    System.out.print(" %");
                }else {
                    System.out.print("%%");
                }
            } else if (num % 3 == 1){
                if (i % 3 == 0){
                    System.out.print("% %");
                } else if (i % 3 == 1){
                    System.out.print(" %%");
                } else {
                    System.out.print("  %");
                }
            } else {
                System.out.print("%");
            }
            System.out.println();
        }

        for (int i = 1; i <= num; i++){
            System.out.print("%");
        }
    }
}
