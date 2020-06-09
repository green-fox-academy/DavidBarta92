package Cloneable;

public class Mentor extends Person {
    private Level level;

    public Mentor(){
        super();
        this.level = level.intermediate;
    }

    public Mentor(String name, int age, String gender, String level){
        super(name, age, gender);
        this.level = Level.valueOf(level);
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
