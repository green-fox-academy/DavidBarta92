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

  public void getAmmo() {
    System.out.println(this.ammoStorage);
  }

  public int fight() {
    int damage = this.ammoStorage * this.baseDamage;
    this.ammoStorage = 0;
    return damage;
  }

  public void refill(int newAmmo) {
    int left = this.maxAmmo - this.ammoStorage;
    if (newAmmo < left) {
      this.ammoStorage = this.ammoStorage + newAmmo;
    } else {
      this.ammoStorage = this.ammoStorage + left;
    }
  }

  public String getType() {
    return this.type;
  }
}
