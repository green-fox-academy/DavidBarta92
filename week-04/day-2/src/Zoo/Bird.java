package Zoo;

public class Bird extends Animal implements ByEgg{
    private int wingSize;

    public Bird(String name) {
        this.name = name;
    }

    public int getWingSize(){
        return this.wingSize;
    }

    @Override
    public String breed() {
        return " laying eggs.";
    }

    @Override
    public String getName(){
        return "Bird";
    }
}
