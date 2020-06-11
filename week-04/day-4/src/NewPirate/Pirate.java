package NewPirate;

public class Pirate {
    private boolean alive;
    private String state;
    private boolean drunk;
    private boolean hasParrot;

    public Pirate(){
        this.state = "alive";
        this.drunk = false;
        this.hasParrot = false;
    }

    public String getState(){
        return this.state;
    }

    public boolean getDrunkStatus(){
        return this.drunk;
    }

    public void drinkSomeRum(){
        if (this.state.equals("alive")){
            this.drunk = true;
        }
        else{
            this.drunk = false;
        }
    }

    public void howsItGoingMate(){
        if (drunk && this.state.equals("alive")){
            System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
        }
        else if(this.state.equals("alive")){
            System.out.println("Pour me anudder!");
        }
    }

    public void die(){
        this.drunk = false;
        this.state = "dead";
    }

    public void brawl(Pirate opponent) {
        if (this.state.equals("alive") && opponent.state.equals("alive")) {
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
