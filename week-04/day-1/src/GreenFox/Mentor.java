package GreenFox;

import GreenFox.Gender;
import GreenFox.Level;

public class Mentor extends Person {
    private Level level;

    public Mentor(){
        this.name = "Jane Done";
        this.age = 30;
        this.gender = gender.FEMALE;
        this.level = level.INTERMEDIATE;
    }

    public Mentor(String name, int age, Gender gender, Level level){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.level = level;
    }

    public void getGoal(){
        System.out.println("Educate brilliant junior software developers.");
    }
    public void introduce(){
        System.out.println("Hi, I'm "+ this.name + " , a " + this.age + " year old " + level + " mentor.");
    }

}
