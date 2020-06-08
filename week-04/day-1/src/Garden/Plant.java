package Garden;

public class Plant {
    protected String color;
    protected byte need;
    protected byte contain;
    protected String type;

    protected Plant(String color) {
        this.color = color;
        this.contain =0;
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
