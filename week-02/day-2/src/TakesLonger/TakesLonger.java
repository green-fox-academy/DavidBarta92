package TakesLonger;

public class TakesLonger {
    public static void main(String[] args) {
        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

        String addition = new String(" always takes longer than");
        String[] parts = quote.split("It");
        StringBuilder quoteB = new StringBuilder(parts[0] + "It" + addition + parts[1]);

        System.out.println(quoteB);
    }
}
