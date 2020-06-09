package Zoo;

public class Mammal extends Animal{
    private int pregnancyTime;

    public int getPregnancyTime(){
        return this.pregnancyTime;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String breed(){
        return this.name + " gives birth to a little one.";
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
