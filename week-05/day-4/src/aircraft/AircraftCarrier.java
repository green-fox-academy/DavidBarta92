package aircraft;

import java.util.ArrayList;
import java.util.List;

public class AircraftCarrier {
  public List<Aircraft> aircrafts;
  public Integer ammo;
  private Integer healthPoints;

  AircraftCarrier(Integer ammo, Integer healthPoints) {
    this.ammo = ammo;
    this.healthPoints = healthPoints;
    this.aircrafts = new ArrayList<>();
  }

  public void add(Aircraft aircraft) {
    this.aircrafts.add(aircraft);
  }

  public void fill() {
    int ammoSum = 0;
    for (int i = 0; i < this.aircrafts.size(); i++) {
      ammoSum = ammoSum + this.aircrafts.get(i).getAmmo();
    }
    if (ammo < ammoSum){
      for (int j = 0; j < this.aircrafts.size(); j++) {
        if (this.aircrafts.get(j).isPriority()) {
          this.ammo = this.aircrafts.get(j).refill(ammo);
        }
      }
    }
  }


  public void fight(AircraftCarrier otherCarrier) {
    int damage = 0;
    for (Aircraft aircraft : aircrafts) {
      damage += aircraft.fight();
    }
    otherCarrier.healthPoints = (otherCarrier.healthPoints >= damage) ? otherCarrier.healthPoints - damage : 0;
  }

  public String getStatus() {
    if (this.healthPoints <= 0) {
      return "It's dead Jim :(";
    }
    Integer totalDamage = 0;
    String status = "";
    for (Aircraft aircraft : aircrafts) {
      totalDamage += (aircraft.ammoStorage * aircraft.baseDamage);
      status += aircraft.getStatus() + "\n";
    }
    return "HP: " + healthPoints + ", Aircraft count: " + aircrafts.size() + ", Ammo Storage: " + this.ammo +
        ", Total Damage: " + totalDamage + "\nAircrafts: \n" + status;
  }


}
