package HW;

public class Mentor {
    private String name;
    private int age;
    private Gender gender;
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

    public void introduce(){
        System.out.println("Hi, I'm "+ this.name + " , a " + this.age + " year old " + level + " mentor.");
    }

    public void getGoal(){
        System.out.println("Educate brilliant junior software developers.");
    }
}
