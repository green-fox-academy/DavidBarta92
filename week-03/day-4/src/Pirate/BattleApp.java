package Pirate;

public class BattleApp {
    public static void main(String[] args) {
        Ship blackSkull = new Ship("Black Skull");
        Ship siren = new Ship("Siren");

        blackSkull.fillShip();
        siren.fillShip();

        blackSkull.battle(siren);
    }
}
