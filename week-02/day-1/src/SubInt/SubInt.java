package SubInt;

import java.util.Arrays;
import java.util.Scanner;

public class SubInt {
    public static void main(String[] args) {
        Scanner userNum = new Scanner(System.in);
        int num = userNum.nextInt();
        int[] listOfNumbers = {1, 11, 34, 52, 61};
        System.out.println(Arrays.toString(subInt(num, listOfNumbers)));
        //  should print: `[0, 1, 4]`
    }
    public static int[] subInt(int num, int[] listOfNumbers) {
        int[] sub = new int[5];
        for (byte i = 0; i < 5; i++) {
            byte k = 0;
            int dec = 0;
            for (byte j = 0; j < 6; j++){
                if (listOfNumbers[i] > 10) {
                    listOfNumbers[i] = listOfNumbers[i] - 10;
                    dec =+ dec;
                }
                if (num == listOfNumbers[i]){
                    sub[k] = i;
                    k += k;
                }
                else if (num == dec) {
                    sub[k] = i;
                    k += k;
                }
            }
        }
        return sub;
    }
}
