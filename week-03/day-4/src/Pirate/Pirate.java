package Pirate;

public class Pirate {
    private boolean alive;
    private boolean drunk;
    private boolean captain;
    private boolean hasParrot;

    public Pirate(){
        this.alive = true;
        this.drunk = false;
        this.captain = false;
        this.hasParrot = false;
    }

    public boolean getAliveStatus(){
        return this.alive;
    }

    public boolean getDrunkStatus(){
        return this.drunk;
    }

    public boolean getCaptainStatus(){
        return this.captain;
    }

    public boolean setCaptainStatus(){
        return this.captain = true;
    }

    public boolean drinkSomeRum(){
        if (alive){
            return this.drunk = true;
        }
        else{
            die();
            return this.drunk = false;
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
        return alive = false;
    }

    public void gotParrot(){
        this.hasParrot = true;
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
                this.die();
                opponent.die();

            }
        }
        else{
            System.out.println("Choose a worthy opponent!");
        }
    }
}
