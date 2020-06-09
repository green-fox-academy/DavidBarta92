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
        this.age = 0;
        this.gender = Gender.female;
        this.color = "Red";
    }

    public Animal(String name, String typeOfItsDiet) {
        this.name = name;
    }

    public String getColor(){
        return this.color;
    }

    public int getAge(){
        return this.age;
    }

    public Gender getGender(){
        return this.gender;
    }

    public void setGender(Gender gender){
        this.gender = gender;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    abstract public String breed();
}
