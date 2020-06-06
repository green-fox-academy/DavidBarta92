package Pirate;

public class Pirate {
    private boolean alive;
    private boolean drunk;
    private boolean captain;

    public Pirate(){
        this.alive = true;
        this.drunk = false;
        this.captain = false;
    }

    public boolean getAliveStatus(){
        return alive;
    }

    public boolean getDrunkStatus(){
        return drunk;
    }

    public boolean getCaptainStatus(){
        return captain;
    }

    public boolean setCaptainStatus(){
        return captain = true;
    }

    public boolean drinkSomeRum(){
        if (alive){
            return drunk = true;
        }
        else{
            die();
            return drunk = false;
        }
    }

    public void howsItGoingMate(){
        if (drunk && alive){
            System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
        }
        else if(alive) {
            System.out.println("Pour me anudder!");
        }
        else {
            die();
        }
    }

    public boolean die(){
        System.out.println("He is dead.");
        return alive = false;
    }

    public void brawl(Pirate opponent) {
        if (this.alive && opponent.alive) {
            byte chance = (byte) (Math.random()*3);
            if (chance == 0) {
                this.die();
            }
            else if (chance == 1){
                opponent.die();
            }
            else{
            }
        }
        else{
            System.out.println("Choose a worthy opponent!");
        }
    }
}
