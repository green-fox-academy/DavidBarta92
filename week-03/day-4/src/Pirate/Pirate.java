package Pirate;

public class Pirate {
    private boolean alive;
    private State state;
    private boolean drunk;
    private boolean hasParrot;

    public Pirate(){
        this.state = State.alive;
        this.drunk = false;
        this.hasParrot = false;
    }

    public State getState(){
        return this.state;
    }

    public boolean getDrunkStatus(){
        return this.drunk;
    }

    public void drinkSomeRum(){
        if (this.state == State.alive){
            this.drunk = true;
        }
        else{
            this.drunk = false;
        }
    }

    public void howsItGoingMate(){
        if (drunk && this.state == State.alive){
            System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
        }
        else if(this.state == State.alive) {
            System.out.println("Pour me anudder!");
        }
    }

    public void die(){
        this.drunk = false;
        this.state = State.dead;
    }

    public void gotParrot(){
        this.hasParrot = true;
    }

    public void brawl(Pirate opponent) {
        if (this.state == State.alive && opponent.state == State.alive) {
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
