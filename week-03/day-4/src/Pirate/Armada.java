package Pirate;

import java.util.ArrayList;

public class Armada {
    private ArrayList<Ship> ships = new ArrayList<Ship>();
    private String name;

    public Armada(String name){
        this.name = name;
        byte numOfShips = (byte) (Math.random()*10);
        for (byte i = 0; i < numOfShips; i++){
            Ship ship = new Ship( this.name +" Ship" + i);
            ship.fillShip();
            this.ships.add(ship);
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
                    System.out.println("First armada won.");
                    return win = true;
                }
            }
        }
        if(lose == (this.ships.size()-1)){
            System.out.println("Second armada won.");
            return win = false;
        }
        else {
            System.out.println("First armada won.");
            return win = true;
        }
    }
}
