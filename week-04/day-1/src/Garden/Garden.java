package Garden;

import java.util.ArrayList;

public class Garden {
    private ArrayList<Plant> plants = new ArrayList<Plant>();

    public void add(Plant plant){
        this.plants.add(plant);
    }

    public void needsWaterInfo(){

        for(int i = 0; i < this.plants.size(); i++){
            if (this.plants.get(i).need > this.plants.get(i).contain){
                    System.out.println("The" + this.plants.get(i).color + this.plants.get(i).type + " needs water");
            }
            else{
                System.out.println("The" + this.plants.get(i).color + this.plants.get(i).type + "doesnt need water");
            }
        }
    }

    public void watering(byte amount){
        for(int i = 0; i < this.plants.size(); i++){
            if (this.plants.get(i).need == 40){

            }
            else{

            }
        }
    }
}
