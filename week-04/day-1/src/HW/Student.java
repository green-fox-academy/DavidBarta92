package HW;

public class Student {
    private String name;
    private int age;
    private Gender gender;
    private String previousOrganization;
    private int skippedDays;

    public Student(){
        this.name = "Jane Done";
        this.age = 30;
        this.gender = gender.FEMALE;
        this.skippedDays =0;
    }

    public Student(String name, int age, Gender gender, String previousOrganization){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.skippedDays =0;
    }

    public void introduce(){
        System.out.println("Hi, I'm "+ this.name + " , a " + this.age + " year old " + this.gender + " from " + previousOrganization + " who skipped " + skippedDays + " days from the course already.");
    }

    public void getGoal(){
        System.out.println("Be a junior software developer.");
    }

    public void skipDays(int numberOfDays){
        this.skippedDays = this.skippedDays + numberOfDays;
    }
}
