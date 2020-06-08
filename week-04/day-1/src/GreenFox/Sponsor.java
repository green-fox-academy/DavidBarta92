package GreenFox;

public class Sponsor extends Person{
    private String company;
    private int hiredStudents;

    public Sponsor(){
        super();
        this.company = "Google";
        this.hiredStudents = 0;
    }

    public Sponsor(String name, int age, String gender, String company){
        super(name, age, gender);
        this.company = company;
        this.hiredStudents = 0;
    }

    @Override
    public String specificIntroduction(){
        return " Who represents" + company + " and hired " + this.hiredStudents + " students so far.";
    }

    @Override
    public String specificGoal(){
        return "Hire brilliant junior software developers.";
    }

    public void hire(){
        this.hiredStudents++;
    }
}
