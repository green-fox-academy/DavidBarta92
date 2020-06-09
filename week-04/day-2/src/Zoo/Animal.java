package Zoo;

public abstract class Animal {
    String name;
    private int age;
    private Gender gender;
    private String color;

    Animal(){
        this.name ="";
        this.age = 0;
        this.gender = Gender.female;
        this.color = "Red";
    }

    Animal(String name){
        this.name = name;
    }

    public abstract String getName();
    public abstract String breed();
    public abstract String getColor();
    public abstract int getAge();
    public abstract Gender getGender();

    public void setGender(Gender gender){
        this.gender = gender;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setAge(int age){
        this.age = age;
    }

}
