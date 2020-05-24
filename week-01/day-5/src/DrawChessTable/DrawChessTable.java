package DrawChessTable;

import java.util.Scanner;

public class DrawChessTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for (int i = num; i > 0; i--) {
            if (i % 2 == 1){
                for (int j = 0; j < 4; j++){
                    System.out.print("% ");
                }
            }
            else {
                for (int j = 0; j < 4; j++){
                    System.out.print(" %");
                }
            }
            System.out.println();
        }
    }
}
