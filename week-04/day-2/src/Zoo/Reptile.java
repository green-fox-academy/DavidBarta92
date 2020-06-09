package Zoo;

public class Reptile extends Animal {
    private int bodyTemperature;

    public int getBodyTemperature(){
        return this.bodyTemperature;
    }

    @Override
    public String breed(){
        return this.name + " laying eggs.";
    }
}
