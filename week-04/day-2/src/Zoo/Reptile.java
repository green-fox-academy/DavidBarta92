package Zoo;

public class Reptile extends Animal implements ByEgg {
    private int bodyTemperature;

    public Reptile(String name) {
        this.name = name;
    }

    public int getBodyTemperature(){
        return this.bodyTemperature;
    }

    @Override
    public String breed(){
        return " laying eggs.";
    }
}
