package GreenFox;

public class Mentor extends Person {
    private Level level;

    public Mentor(){
        super();
        this.level = level.intermediate;
    }

    public Mentor(String name, int age, Gender gender, Level level){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.level = level;
    }

    @Override
    public String specificGoal(){
        return "Educate brilliant junior software developers.";
    }

    @Override
    public String specificIntroduction(){
        return ", " + level + " mentor.";
    }

}
