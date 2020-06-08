package GreenFox;

public class Student extends Person{
    private String previousOrganization;
    private int skippedDays;

    public Student(){
        super();
        this.previousOrganization = "The School of Life";
        this.skippedDays = 0;
    }

    public Student(String name,int age,Gender gender,String previousOrganization){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.previousOrganization = previousOrganization;
        this.skippedDays = 0;
    }

    @Override
    public String specificGoal(){
        return "Be a junior software developer.";
    }

    @Override
    public String specificIntroduction(){
        return " from " + previousOrganization + " who skipped " + skippedDays + " days from the course already.";
    }

    public void skipDays(int numberOfDays){
        this.skippedDays = skippedDays - numberOfDays;
    }

    public void showData(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(gender);
        System.out.println(previousOrganization);
        System.out.println(skippedDays);
    }
}
