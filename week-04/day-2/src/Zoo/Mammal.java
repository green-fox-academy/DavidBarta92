package Zoo;

public class Mammal extends Animal{
    private int pregnancyTime;

    public Mammal(String name) {
        this.name = name;
    }

    public int getPregnancyTime(){
        return this.pregnancyTime;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String breed(){
        return " by pushing miniature versions out.";
    }

    @Override
    public String getColor() {
        return null;
    }

    @Override
    public int getAge() {
        return 0;
    }

    @Override
    public Gender getGender() {
        return null;
    }
}
