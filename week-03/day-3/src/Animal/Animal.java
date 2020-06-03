package Animal;

public class Animal {
    int hunger;
    int thirst;

    public Animal (){
        this(50,50);
    }
    public Animal(int hunger, int thirst) {
        this.hunger=hunger;
        this.thirst=thirst;
    }
    public void eat(int hunger){
        hunger++;
    }
    public void drink(int thirst){
        thirst++;
    }
    public void play(int hunger, int thirst){
        hunger--;
        thirst--;
    }

}
