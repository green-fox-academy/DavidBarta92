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

    public void war(Armada otherArmada){
        int j = 0;
        while (this.ships.get(i).battle(otherArmada.ships.get(j))) {

        }
    }
}
