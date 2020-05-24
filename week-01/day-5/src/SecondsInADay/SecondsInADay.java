package SecondsInADay;

import java.util.Scanner;

public class SecondsInADay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, type the current hour!");
        int currentHours = scanner.nextInt();
        System.out.println("Please, type the current minute!");
        int currentMinutes = scanner.nextInt();
        System.out.println("Please, type the current second!");
        int currentSeconds = scanner.nextInt();
        int remHours = 0;
        int remMinutes = 0;
        int remSeconds = 0;

        if (currentSeconds == 0) {
            remSeconds = remSeconds++;
        }
        if (currentMinutes == 0) {
            remMinutes = remMinutes++;
        }
        if (currentHours == 0) {
            remHours = remHours++;
        }

        remHours = remHours + 24 - ++currentHours;
        remMinutes = 60 - ++currentMinutes;
        remSeconds = 60 - ++currentSeconds;

        System.out.println("The remaining time is: " + remHours + ":" + remMinutes + ":" + remSeconds);
    }
}
