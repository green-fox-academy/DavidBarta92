package Pirate;

import java.util.ArrayList;

public class Ship {
    private ArrayList<Pirate> crew = new ArrayList<Pirate>();
    private Pirate captain;
    private int score;
    private boolean winner;

    public Ship(String s){
        this.score = 0;
    }

    public boolean getWinStatus(){
        return this.winner;
    }

    public void fillShip(){
        byte numOfCrew = (byte) (Math.random()*30);
        for (byte i = 0; i < numOfCrew; i++){
            crew.add(i, new Pirate());
        }
        this.captain = this.crew.get(0);

        System.out.println("This ship: " + numOfCrew + " sailor on the board! The score of the ship: " + this.score);
        if (this.crew.get(0).getDrunkStatus()){
            System.out.println("This ship: The captain is drunk.");
        }
        else {
            System.out.println("This ship: The captain is sober.");
        }
    }

    public boolean battle(Ship otherShip){

        System.out.println("XXXXXXXXXX");
        System.out.println("X BATTLE X");
        System.out.println("XXXXXXXXXX");
        byte i = 0;
        while (i < this.crew.size() && i < otherShip.crew.size()){
            this.crew.get(i).brawl(otherShip.crew.get(i));
            byte anotherCup = (byte) (Math.random()*2);
            if (this.crew.get(i).getAliveStatus()) {
                this.score++;
                if (anotherCup == 1){
                    otherShip.crew.get(0).drinkSomeRum();
                    otherShip.score++;
                }
            }
            else if (otherShip.crew.get(i).getAliveStatus()){
                if (anotherCup == 1){
                    this.crew.get(0).drinkSomeRum();
                    this.score++;
                }
            }
            i++;
        }
        if (this.crew.get(0).getAliveStatus() && this.crew.get(0).getDrunkStatus()) {
            this.score++;
        }
        else if (otherShip.crew.get(0).getAliveStatus() && otherShip.crew.get(0).getDrunkStatus()){
            otherShip.score++;
        }

        //fist ship data
        System.out.println("First ship: The score of the ship: " + this.score);
        if (this.crew.get(0).getDrunkStatus()){
            System.out.println("First ship: captain is drunk.");
        }
        else {
            System.out.println("First ship: The captain is sober.");
        }

        //second ship data
        System.out.println("Second ship: The score of the ship: " + otherShip.score);
        if (this.crew.get(0).getDrunkStatus()){
            System.out.println("Second ship: The captain is drunk.");
        }
        else {
            System.out.println("Second ship: The captain is sober.");
        }
        boolean win;
        if (this.score > otherShip.score) {
            System.out.println("First ship is the winner.");
            System.out.println();
            return winner = true;
        }
        else {
            System.out.println("Second ship is the winner.");
            System.out.println();
            return winner = false;
        }
    }
}
