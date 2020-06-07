package Pirate;

public class BattleApp {
    public static void main(String[] args) {
        System.out.println("      _~");
        System.out.println("   _~)_)_~");
        System.out.println("  )_))_))_)");
        System.out.println("  _!__!__!_");
        System.out.println("  \\_______/");
        System.out.println("~~~~~~~~~~~~~~~~~~~~");


        Armada armada1 = new Armada("Armada 1");
        Armada armada2 = new Armada("Armada 2");

        armada1.war(armada2);

    }
}
