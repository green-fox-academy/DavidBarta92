package Garden;

public class main {
    public static void main(String[] args) {

        Garden garden = new Garden();
        Flower yellow = new Flower("yellow");
        garden.add(yellow);
        Flower blue = new Flower("blue");
        garden.add(blue);
        Tree purple = new Tree ("purple");
        garden.add(purple);
        Tree orange = new Tree("orange");
        garden.add(orange);


        garden.needsWaterInfo();

        garden.watering(40);

        garden.needsWaterInfo();

        garden.watering(70);

        garden.needsWaterInfo();

    }
}
