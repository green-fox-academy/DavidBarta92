package Cloneable;

public class Main {
    public static void main(String[]args) throws CloneNotSupportedException {
        Student janos = new Student("John", 20, "male", "BME");
        Student janos2 = (Student) janos.clone();
        janos2.name = "Johnny";
        janos2.introduce();
        janos.introduce();


    }
}