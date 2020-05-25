package Reverse;

public class Reverse {
    public static void main(String[] args) {
        byte[] numbers = {3, 4, 5, 6, 7};
        for (byte i = 0; i < numbers.length; i++) {
            byte temp = numbers[i];
            numbers[i]= numbers[((byte) numbers.length)-i-1];
            numbers[((byte) numbers.length)-i-1]= temp;
            System.out.println(numbers[i]);
        }
        for (byte i = 0; i < numbers.length; i++) {
// nem jo
        }
    }
}
