package Pirate;

import java.util.ArrayList;

public class Ship {
    private ArrayList<Pirate> crew = new ArrayList<Pirate>();
    private Pirate captain;
    private int score;

    public Ship(){
        this.score = 0;
    }

    public void fillShip(){
        byte numOfCrew = (byte) (Math.random()*30);
        for (byte i = 0; i < numOfCrew; i++){
            crew.add(i, new Pirate());
        }
        this.captain = this.crew.get(0);
    }
    public boolean battle(Ship otherShip){

        boolean win;
        if (this.score > otherShip.score) {
            return win = true;
        }
        else {
            return win = false;
        }
    }
}
