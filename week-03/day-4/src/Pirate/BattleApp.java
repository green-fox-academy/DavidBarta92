package Pirate;

public class BattleApp {
    public static void main(String[] args) {
        System.out.println("      _~");
        System.out.println("   _~)_)_~");
        System.out.println("  )_))_))_)");
        System.out.println("  _!__!__!_");
        System.out.println("  \\_______/");
        System.out.println("~~~~~~~~~~~~~~~~~~~~");


        Ship blackSkull = new Ship("Black Skull");
        Ship siren = new Ship("Siren");

        blackSkull.fillShip();
        siren.fillShip();

        blackSkull.battle(siren);
    }
}
