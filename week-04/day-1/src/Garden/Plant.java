package Garden;

public class Plant {
    protected String color;
    protected int need;
    protected int amount;
    protected String type;

    protected Plant(String color) {
        this.color = color;
        this.amount =0;
    }

    protected boolean needs(){
        boolean needs;
        if (this.need > this.amount){
            needs = true;
        }
        else {
            needs = false;
        }
        return needs;
    }

    protected void add(int newAmount){
        this.amount = this.amount + newAmount;
    }

    protected boolean is(String type){
        boolean typeMatch;
        if (type == this.type){
            typeMatch = true;
        }
        else {
            typeMatch = false;
        }
        return typeMatch;
    }
}
