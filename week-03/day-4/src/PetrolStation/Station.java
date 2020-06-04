package PetrolStation;

public class Station {
    int gasAmount;

    public Station(){
        this.gasAmount = 100000000;
    }

    public void refill(Car car){
        car.gasAmount++;
    }
}
