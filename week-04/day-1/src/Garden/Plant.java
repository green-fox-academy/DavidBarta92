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
            if (5 > this.amount && this.type.contentEquals("Flower")){
                needs = true;
            }
            else if (10 > this.amount && this.type.contentEquals("Tree")){
                needs = true;
            }
            else {
                needs = false;
            }
            return needs;
    }

    protected void add(int newAmount){
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
