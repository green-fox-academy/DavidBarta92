package Cloneable;

public abstract class Person {
    protected String name;
    protected int age;
    protected Gender gender;

    public Person(){
        this.name = "Jane Doe";
        this.age = 30;
        this.gender = gender.female;
    }

    public Person(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = Gender.valueOf(gender);
    }

    public void introduce(){
        System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender + specificIntroduction());
    }
    public String specificIntroduction(){
        return ".";
    }

    public void getGoal(){
        System.out.println(specificGoal());
    }

    public String specificGoal(){
        return "My goal is: Live for the moment!";
    }

}