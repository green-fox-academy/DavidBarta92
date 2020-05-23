package DrawPyramid;

import java.util.Scanner;

public class DrawPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for (int i = num; i > 0; i--) {
            for (int j = i; j > 1; j--){
                System.out.print(" ");
            }
            for (int k = i; k <= num; k++){
                System.out.print("*");
                if (k < num) {
                    for (int l = k; l <= k; l++) {
                        System.out.print("*");
                    }
                }
            }
            System.out.println();
        }
    }
}
