package MileToKmConverter;


public class MileToKmConverter {
    public static void main(String[] args) {
        double miles = 3.0;
        double inkm;

        inkm = (double) miles * 1.609344;
        System.out.println(inkm + "km");
    }
}
