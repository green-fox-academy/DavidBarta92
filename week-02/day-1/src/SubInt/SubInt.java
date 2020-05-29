package SubInt;

import java.util.Arrays;
import java.util.Scanner;

public class SubInt {
    public static void main(String[] args) {
        Scanner userNum = new Scanner(System.in);
        int num = userNum.nextInt();
        int[] listOfNumbers = {1, 11, 34, 52, 61};
        subInt(num, listOfNumbers);
    }
    public static void subInt(int num, int[] listOfNumbers) {
        int[] indexNum = new int[5];
        for (byte i = 1; i <= 5; i++) {
            int dec = 0;
            for (byte j = 0; j < 9; j++){
                if (listOfNumbers[i-1] > 9) {
                    listOfNumbers[i-1] = listOfNumbers[i-1] - 10;
                    dec = ++dec;
                }
                else if (listOfNumbers[i-1] == num || dec == num) {
                    indexNum[i-1] = i;
                }
            }
        }
        System.out.print("Index: ");
        for (byte i = 0; i <5; i++){
            if (indexNum[i] > 0){
                System.out.print(indexNum[i] -1 + " ");
            }
        }
    }
}
