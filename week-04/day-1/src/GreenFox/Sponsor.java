package GreenFox;

public class Sponsor extends Person{
    private String company;
    private int hiredStudents;

    public Sponsor(){
        super();
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

    @Override
    public void introduce(){
        System.out.println("Hi, I'm "+ this.name + " , a " + this.age + " year old " + this.gender + "who represents" + company + " and hired " + hiredStudents + " students so far.");
    }

    @Override
    public String getGoal(){
        return "Hire brilliant junior software developers.";
    }

    public void hire(){
        this.hiredStudents++;
    }
}
