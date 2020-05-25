package Reverse;

public class Reverse {
    public static void main(String[] args) {
        byte[] numbers = {3, 4, 5, 6, 7};
        byte[] reverseNumbers = {0, 0, 0, 0, 0};
        for (byte i = 0; i < numbers.length; i++) {
            reverseNumbers[i] = numbers[numbers.length-1-i];
        }
        for (byte i = 0; i < numbers.length; i++) {
            numbers[i] = reverseNumbers[i];
            System.out.println(numbers[i]);
        }
    }
}
