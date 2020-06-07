package Pirate;

import java.util.ArrayList;

public class Armada {
    private ArrayList<Ship> ships = new ArrayList<Ship>();
    private String name;

    public Armada(String name){
        this.name = name;

        byte numOfCrew = (byte) (Math.random()*30);
        for (byte i = 0; i < numOfCrew; i++){
            ships.add(i, new Ship("lala")); // ide mast
        }
    }

    public boolean war(Armada otherArmada){
        int j = 0;
        int lose = 0;
        boolean win;
        for (int i = 0; i < this.ships.size(); i++){
            while(this.ships.get(i).getWinStatus() != false){
                if (j<(this.ships.size()-1)){
                    this.ships.get(i).battle(otherArmada.ships.get(j));
                    if (this.ships.get(i).getWinStatus()){
                        j++;
                    }
                    else{
                        lose++;
                    }
                }
                else {
                    return win = true;
                }
            }
        }
        if(lose == this.ships.size()){
            return win = false;
        }
        else {
            return win = true;
        }
    }
}
