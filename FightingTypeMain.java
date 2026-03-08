package pokedexBindu;

import FightingType.*;

public class FightingTypeMain {
    public static void main(String[] args) {

        Machamp m = new Machamp("Machamp", 40, 120, 4);
        Lucario l = new Lucario("Lucario", 35, 95, 80);
        IronValiant iv = new IronValiant("Iron Valiant", 50, 130, 90);

        // Demonstrate behaviours//
        m.dynamicPunch();
        m.train();

        l.auraSphere();
        l.meditate();

        iv.spiritBreak();
        iv.stylishStrike();
    }
}