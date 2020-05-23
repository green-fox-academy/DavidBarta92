package DrawDiamond;

import java.util.Scanner;

public class DrawDiamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int i;
        for (i = num; i > 0; i--) {
            for (int j = i; j > 1; j--) {
                System.out.print(" ");
            }
            for (int k = i; k <= num; k++) {
                System.out.print("*");
                if (k < num) {
                    for (int l = k; l <= k; l++) {
                        System.out.print("*");
                    }
                }
            }
            System.out.println();
        }
        if (i == 0) {
            for (i = 1; i < num; i++) {
                for (int j = i; j > 0; j--) {
                    System.out.print(" ");
                }
                for (int k = i; k < num; k++) {
                    System.out.print("*");
                    if (k > i) {
                        for (int l = k; l <= k; l++) {
                            System.out.print("*");
                        }
                    }
                }
                System.out.println();
            }
        }
    }
}
