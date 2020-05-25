package DoubleItems;

public class DoubleItems {
    public static void main(String[] args) {
        int[] numList = {3, 4, 5, 6, 7};
        for (byte i  = 0; i < numList.length; i++){
            numList[i] = numList[i] * 2;
            System.out.println(numList[i]);
        }
    }
}
