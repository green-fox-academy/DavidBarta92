package DrawDiagonal;

import java.util.Scanner;

public class DrawDiagonal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num > 5){
            int edge = (num - 5) / 2;
            for (int i = num; i > 0; i--) {
                if (i == num || i == 1){
                    for (int j = 0; j < 6; j++){
                        System.out.print("%");
                    }
                }
                else {
                    for (int j = 0; j < 4; j++){
                        System.out.print("%");
                        for (int k = 0; k < 4; k++){
                            System.out.print("");
                        }
                        System.out.print("%");
                    }
                }
                System.out.println();
            }
        }
        else {
            System.out.println("Please enter a bigger number than 5!");
        }
    }
}
