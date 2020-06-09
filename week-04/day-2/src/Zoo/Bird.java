package Zoo;

public class Bird extends Animal{
    private int wingSize;

    public int getWingSize(){
        return this.wingSize;
    }

    @Override
    public String breed(){
        return this.name + " laying eggs.";
    }
}
