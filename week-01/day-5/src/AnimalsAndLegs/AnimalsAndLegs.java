package AnimalsAndLegs;

import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type the number of chickens!");
        int a = scanner.nextInt();
        System.out.println("Type the number of pigs!");
        int b = scanner.nextInt();
        int legs = (a * 2) + (b * 4);
        System.out.println("All of the animals have " + legs + " legs.");
        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        // It should print how many legs all the animals have


    }
}
