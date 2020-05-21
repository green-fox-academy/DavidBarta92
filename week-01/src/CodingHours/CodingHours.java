package CodingHours;

public class CodingHours {
    public static void main(String[] args) {
        short hours = 6;
        short weeks = 17;
        short total = (short) ((hours*(7*weeks))-(2*weeks));

        System.out.println("Kodolassal toltott orak szama:" + total);

        short hpw = 52;
        short percent = (short) (680 / (hpw * weeks));
        System.out.println(hpw * weeks + " hpw*weeks");
        System.out.println(percent + "%");
    }
}
