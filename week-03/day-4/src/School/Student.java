package School;

import javax.naming.Name;

public class Student {
    String status;
    String name;

    public Student(String studentName) {
        this.name = studentName;
    }

    public void learn(){
        this.status = "Learning...";
        System.out.println(name + " is " + status);
    }
    public void question(Teacher teacher){
        this.status = "Asking...";
        teacher.answer();
    }
}
