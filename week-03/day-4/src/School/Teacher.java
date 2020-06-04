package School;

public class Teacher {
    String status;
    String name;

    public Teacher(String teacherName) {
        this. name = teacherName;
    }

    public void teach(Student student){
        this.status = "Teaching...";
        student.learn();
    }
    public void answer(){
        this.status = "Answering...";
        System.out.println(name + " is " + status);
    }
}
