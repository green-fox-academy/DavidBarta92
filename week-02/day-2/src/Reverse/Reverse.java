package Reverse;

public class Reverse {
    public static void main(String[] args) {
        String toBeReversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

        System.out.println(reverse(toBeReversed));
    }
    public static String reverse(String toBeReversed) {
        String done = null;
        char[] rev = new char[toBeReversed.length()];
        for (int i = 0; i <= toBeReversed.length() -1; i++) {
            rev[toBeReversed.length()-1 - i] = toBeReversed.charAt(i);
        }
        done = String.valueOf(rev);
        return done;
    }
}

