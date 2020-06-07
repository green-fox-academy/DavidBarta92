package HW;

public class Student {
    private String name;
    private int age;
    private Gender gender;

    public Person(){
        this.name = "Jane Done";
        this.age = 30;
        this.gender = gender.FEMALE;
    }

    public Person(String name, int age, Gender gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void introduce(){
        System.out.println("Hi, I'm "+ this.name + " , a " + this.age + " year old " + this.gender + ".");
    }

    public void getGoal(){
        System.out.println("Be a junior software developer.");
    }

    public void skipDays(int numberOfDays){

    }
}
