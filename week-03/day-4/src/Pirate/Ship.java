package Pirate;

import java.util.ArrayList;

public class Ship {
    private ArrayList<Pirate> crew = new ArrayList<Pirate>();
    private Pirate captain;
    private int score;
    private String name;
    private boolean winner;

    public Ship(String name){
        this.name = name;
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
        this.crew.get(0).setCaptainStatus();
        this.captain = this.crew.get(0);

        System.out.println(this.name + ": " + numOfCrew + " sailor on the board! The score of the ship: " + this.score);
        if (this.crew.get(0).getDrunkStatus()){
            System.out.println(this.name + ": The captain is drunk.");
        }
        else {
            System.out.println(this.name + ": The captain is sober.");
        }
    }

    public boolean battle(Ship otherShip){

        System.out.println("XXXXXXXXXX");
        System.out.println("X BATTLE X");
        System.out.println("XXXXXXXXXX");

        for (byte i = 0; i < this.crew.size(); i++){ // itt van egy kis gond
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
        }
        if (this.crew.get(0).getAliveStatus() && this.crew.get(0).getDrunkStatus()) {
            this.score++;
        }
        else if (otherShip.crew.get(0).getAliveStatus() && otherShip.crew.get(0).getDrunkStatus()){
            otherShip.score++;
        }

        //fist ship data
        System.out.println(this.name + ": " + this.crew.size() + " sailor on the board! The score of the ship: " + this.score);
        if (this.crew.get(0).getDrunkStatus()){
            System.out.println(this.name + ": The captain is drunk.");
        }
        else {
            System.out.println(this.name + ": The captain is sober.");
        }

        //second ship data
        System.out.println(otherShip.name + ": " + otherShip.crew.size() + " sailor on the board! The score of the ship: " + otherShip.score);
        if (this.crew.get(0).getDrunkStatus()){
            System.out.println(otherShip.name + ": The captain is drunk.");
        }
        else {
            System.out.println(this.name + ": The captain is sober.");
        }
        boolean win;
        if (this.score > otherShip.score) {
            System.out.println(this.name + " is the winner.");
            System.out.println();
            return winner = true;
        }
        else {
            System.out.println(otherShip.name + " is the winner.");
            System.out.println();
            return winner = false;
        }
    }
}
