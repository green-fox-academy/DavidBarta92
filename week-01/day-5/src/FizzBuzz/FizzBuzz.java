package FizzBuzz;

public class FizzBuzz {
    public static void main(String[] args) {
        for (byte i = 1; i <= 100; i++) {
            boolean fizz = 0 == (i % 3);
            boolean buzz = 0 == (i % 5);
            if (fizz && buzz) {
                System.out.println("FizzBuzz");
            } else if (fizz || buzz) {
                if (fizz) {
                    System.out.println("Fizz");
                } else {
                    System.out.println("Buzz");
                }
            } else {
                System.out.println(i);
            }
        }
    }
}
