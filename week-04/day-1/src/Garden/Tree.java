package Garden;

public class Tree extends Plant{

    public Tree(String color){
        super(color);
        this.need = 70;
        this.type = "Tree";
    }

    @Override
    protected void add(int newAmount){
        int finalAmount = (newAmount / 100)*40;
        this.amount = this.amount + finalAmount;
    }
}
