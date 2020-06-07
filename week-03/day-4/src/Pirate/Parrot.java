package Pirate;

import java.awt.*;

public class Parrot {
    private Color color;
    private Pirate shoulder;

    public Parrot(){

    }

    public void speak(){
        System.out.println("Helllloo");
    }

    public void sit(Pirate pirate){
        pirate.gotParrot();
        Pirate shoulder = pirate;
    }
}

