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

    public void getGoal(){
        System.out.println("Be a junior software developer.");
    }

    public void introduce(){
        System.out.println("Hi, I'm "+ this.name + " , a " + this.age + " year old " + this.gender + " from " + previousOrganization + " who skipped " + skippedDays + " days from the course already.");
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
