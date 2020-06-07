package HW;

public class Sponsor {
    private String name;
    private int age;
    private Gender gender;
    private String company;
    private int hiredStudents;

    public Sponsor(){
        this.name = "Jane Done";
        this.age = 30;
        this.gender = gender.FEMALE;
        this.company = "Google";
        this.hiredStudents = 0;
    }

    public Sponsor(String name, int age, Gender gender, String company){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.company = company;
        this.hiredStudents = 0;
    }

    public void introduce(){
        System.out.println("Hi, I'm "+ this.name + " , a " + this.age + " year old " + this.gender + "who represents" + company + " and hired " + hiredStudents + " students so far.");
    }

    public void getGoal(){
        System.out.println("Hire brilliant junior software developers.");
    }

    public void hire(){
        this.hiredStudents++;
    }
}
