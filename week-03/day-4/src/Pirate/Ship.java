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
        this.crew.get(0).setCaptainStatus();
        this.captain = this.crew.get(0);
    }

    public boolean battle(Ship otherShip){
        for (byte i = 0; i < this.crew.size(); i++){
            this.crew.get(i).brawl(otherShip.crew.get(i));
            if (this.crew.get(i).getAliveStatus()) {
                this.score++;
            }
            else if (otherShip.crew.get(i).getAliveStatus()){
                otherShip.score++;
            }
        }
        if (this.crew.get(0).getAliveStatus() && this.crew.get(0).getDrunkStatus()) {
            this.score++;
        }
        else if (otherShip.crew.get(0).getAliveStatus() && otherShip.crew.get(0).getDrunkStatus()){
            otherShip.score++;
        }
        boolean win;
        if (this.score > otherShip.score) {
            return win = true;
        }
        else {
            return win = false;
        }
    }
}
