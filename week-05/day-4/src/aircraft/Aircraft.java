package aircraft;

public abstract class Aircraft {
  protected int ammoStorage;
  protected int maxAmmo;
  protected int baseDamage;
  protected String type;

  public Aircraft() {
    this.ammoStorage = 0;
    this.maxAmmo = 0;
    this.baseDamage = 0;
  }

  public int getAmmo() {
    return this.ammoStorage;
  }

  public int fight() {
    int damage = this.ammoStorage * this.baseDamage;
    this.ammoStorage = 0;
    return damage;
  }

  public int refill(int newAmmo) {
    int left = this.maxAmmo - this.ammoStorage;
    if (newAmmo < left) {
      this.ammoStorage = this.ammoStorage + newAmmo;
    } else {
      this.ammoStorage = this.ammoStorage + left;
    }
    return left;
  }

  public String getType() {
    return this.type;
  }

  public String getStatus() {
    return "Type " + this.getType() + " Ammo: " + this.ammoStorage + " Base Damage: "
        + this.baseDamage + " All Damage: " + this.ammoStorage * this.baseDamage;
  }

  abstract boolean isPriority();

}
