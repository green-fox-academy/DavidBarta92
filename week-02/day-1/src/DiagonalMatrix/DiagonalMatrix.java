package DiagonalMatrix;

import java.util.Scanner;

public class DiagonalMatrix {
    public static void main(String[] args) {
        int[][] numbers = new int[3][3];
        for (byte row  = 0; row < numbers.length; row++){
            for (byte col = 0; col < numbers[row].length; col++){
                numbers[row][col] = 0;
            }
        }
        for (byte row  = 0; row < numbers.length; row++){
            numbers[row][row] = 1;
        }
        for (byte row  = 0; row < numbers.length; row++) {
            for (byte col = 0; col < numbers[row].length; col++) {
                System.out.print(numbers[row][col] + " ");
            }
            System.out.println();
        }
    }
}
