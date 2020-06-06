package Pirate;

public class BattleApp {
    public static void main(String[] args) {
        Ship blackSkull = new Ship();
        Ship siren = new Ship();

        blackSkull.battle(siren);
    }
}
