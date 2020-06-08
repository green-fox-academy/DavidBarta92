package Garden;

public class Flower extends Plant{

    public Flower(String color){
        super(color);
        this.need = 40;
        this.type = "Flower";
    }

    @Override
    protected void add(int newAmount){
        int finalAmount = (newAmount / 100)*75;
        this.amount = this.amount + finalAmount;
    }
}
