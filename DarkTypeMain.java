package pokedexBindu;


import Darktype.*;

public class DarkTypeMain {
    public static void main(String[] args) {

        // UMBREON — Equality Operators
        Umbreon u = new Umbreon("Umbreon", 110, 80, true);
        System.out.println("=== Umbreon ===");
        u.checkAlertStatus();
        u.compareDefense(100);
        System.out.println();

        // HYDREIGON — Logical Operators
        Hydreigon h = new Hydreigon("Hydreigon", 85, 95, true);
        System.out.println("=== Hydreigon ===");
        h.checkRampage();
        h.checkAggression();
        System.out.println();

        // GRIMMSNARL — Conditional Operator
        Grimmsnarl g = new Grimmsnarl("Grimmsnarl", 90, 60, false);
        System.out.println("=== Grimmsnarl ===");
        g.showExpression();
        g.trickChance();
    }
}