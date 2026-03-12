package pokedexBindu;

import Fairytype.*;

public class FairyTypeMain {
    public static void main(String[] args) {

        // SYLVEON — Relational operators (<, >=)
        Sylveon s = new Sylveon("Sylveon", 90, 85, 40);
        System.out.println("=== Sylveon ===");
        s.checkThreat();
        s.checkDefenseBoost();
        System.out.println();

        // TOGEKISS — Relational operators (<=, !=)
        Togekiss t = new Togekiss("Togekiss", 95, 15, true);
        System.out.println("=== Togekiss ===");
        t.checkEnvironment();
        t.checkFlightStatus();
        System.out.println();

        // HATTERENE — Relational operators (>, ==)
        Hatterene h = new Hatterene("Hatterene", 60, 70, false);
        System.out.println("=== Hatterene ===");
        h.detectNoise();
        h.checkCalmState();
    }
}