package Factorio;

import java.util.Scanner;

public class Factorio{
    public static void main(String[] args) {
        Scanner userNum = new Scanner(System.in);
        int num = userNum.nextInt();
        System.out.println(factorio(num));
    }
    public static int factorio(int num){
        int result = 1;
        if (num == 0){
            result = 1;
        }
        else {
            for (int i = 1; i <= num; i++) {
                result = result * i;
            }
        }
        return result;
    }
}
