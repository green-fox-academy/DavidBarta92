package School;

public class Main{
    public static void main(String[] args) {
        Teacher magda = new Teacher("Magda");
        Student patrik = new Student("Patrik");

        patrik.question(magda);
        magda.teach(patrik);
    }
}
