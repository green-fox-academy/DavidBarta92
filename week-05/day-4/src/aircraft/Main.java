package aircraft;

public class Main {
  public static void main(String[] args) {
    F35 f35 = new F35();
    f35.getAmmo();
    f35.refill(10);
    f35.getAmmo();
  }
}
