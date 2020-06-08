package GreenFox;

public class Person {
    protected String name;
    protected int age;
    protected Gender gender;

    public Person(){
        this.name = "Jane Doe";
        this.age = 30;
        this.gender = gender.FEMALE;
    }

    public Person(String name, int age, Gender gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void introduce(){
        System.out.println("Hi, I'm name, a age year old gender.");
    }
    public String getGoal(){
        return "My goal is: Live for the moment!";
    }

}
