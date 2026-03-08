package pokedexBindu;


import java.util.Scanner;

// Import all user define packages
import Darktype.*;
import Fairytype.*;
import FightingType.*;
import PsychicType.*;
import FireType.*;
import IceType.*;
import WaterType.*;
import pokedexBindu.ParentPokemon;
import pokedexBindu.WaterType.ChildPokemon.Milotic;
import pokedexBindu.GrassType.ChildType.Venusaur;






public class UnifiedMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== UNIVERSAL POKÉMON PROGRAM =====");
        System.out.println("Choose a Pokémon Type:");
        System.out.println("1. Dark Type");
        System.out.println("2. Fairy Type");
        System.out.println("3. Psychic Type");
 	System.out.println("4. FIGHTING TYPE");
 	System.out.println("5. FIRE TYPE");
	System.out.println("6. Ice Type");
        System.out.println("7.Water Type");
        System.out.println("8.Grass Type");
    
        System.out.print("Enter your choice: ");

        int choice = sc.nextInt();
        System.out.println();

        switch (choice) {

            // ---------------- DARK TYPE ----------------
            case 1:
                Umbreon u = new Umbreon("Umbreon", 110, 80, true);
                Hydreigon h = new Hydreigon("Hydreigon", 85, 95, true);
                Grimmsnarl g = new Grimmsnarl("Grimmsnarl", 90, 60, false);

                System.out.println("=== Dark Type ===");
                u.checkAlertStatus();
                u.compareDefense(100);

                h.checkRampage();
                h.checkAggression();

                g.showExpression();
                g.trickChance();
                break;

            // ---------------- FAIRY TYPE ----------------
            case 2:
                Sylveon s = new Sylveon("Sylveon", 90, 85, 40);
                Togekiss t = new Togekiss("Togekiss", 95, 15, true);
                Hatterene ht = new Hatterene("Hatterene", 60, 70, false);

                System.out.println("=== Fairy Type ===");
                s.checkThreat();
                s.checkDefenseBoost();

                t.checkEnvironment();
                t.checkFlightStatus();

                ht.detectNoise();
                ht.checkCalmState();
                break;

            

            // ---------------- PSYCHIC TYPE ----------------
            case 3:
                Alakazam ak = new Alakazam("Alakazam", "white", 120, 134);
                Gardevoir gd = new Gardevoir("Gardevoir", "Psychic", "Yellow", 123);
                Metagross mg = new Metagross("Metagross", "Psychic", 123, 45);

                System.out.println("=== Psychic Type ===");
                System.out.println("Name: " + ak.getName());
                System.out.println("Color: " + ak.getColor());
                System.out.println("Speed: " + ak.getSpeed());
                System.out.println("Level: " + ak.getLevel());
                ak.supersmart();
                ak.avoidsPhysicalFights();

                System.out.println("Name: " + gd.getName());
                gd.kind();
                gd.protective();
                gd.FightsHardForOthers();

                System.out.println("Name: " + mg.getName());
                mg.logical();
                mg.robotic();
                mg.calculateEverything();
                break;

 // ---------------- FIGHTING TYPE ----------------
            case 4:
                Machamp m = new Machamp("Machamp", 40, 120, 4);
                Lucario l = new Lucario("Lucario", 35, 95, 80);
                IronValiant iv = new IronValiant("Iron Valiant", 50, 130, 90);

                System.out.println("=== Fighting Type ===");
                m.dynamicPunch();
                m.train();

                l.auraSphere();
                l.meditate();

                iv.spiritBreak();
                iv.stylishStrike();
                break;
// ---------------- FIRE TYPE ----------------
            case 5:
                Charizard c = new Charizard();
                Arcanine a = new Arcanine();
                Talonflame tf = new Talonflame();

                System.out.println("=== Fire Type ===");
                c.display();
                c.roar();
                c.displayrunLevel();
                c.hitpoints();

                System.out.println(a.getdesc());
                System.out.println("RunSpeed: " + a.getrunspeed());
                System.out.println("Is fast? " + a.isFast());
                a.displayColor();

                System.out.println(tf.getdesc());
                System.out.println("Is fast? " + tf.isfast());
                tf.displayColor();
                break;

  // ---------------- ICE TYPE ----------------
            case 6:
                Glaceon glaceon = new Glaceon("Glaceon", 20, -10, 7);
                Froslass froslass = new Froslass("Froslass", 22, 10, true);
                Baxcalibur bax = new Baxcalibur("Baxcalibur", 30, 100, true);

                System.out.println("=== Ice Type ===");
                glaceon.freezeAir();
                glaceon.keepDistance();

                froslass.haunt();
                froslass.sneak();

                bax.attack();
                bax.roar();
                break;
       // ---------------- WATER TYPE ----------------

            case 7:
                Blastoise bl = new Blastoise();
                Gyarados gy = new Gyarados();
                Milotic ml = new Milotic();

                System.out.println("=== Water Type ===");
                System.out.println(bl.getName());
                bl.displayColor();

                gy.intimidate();
                gy.aquaTail();
                gy.attack();
                gy.attack(90);
                gy.attack(120, "Charizard");

                ml.attack();
                ml.recover();
                break;

// ---------------- GRASS TYPE (POLYMORPHISM) ----------------
            case 8:
                ParentPokemon p1 = new Venusaur();
                ParentPokemon p2 = new Milotic();

                ParentPokemon[] team = { p1, p2 };

                System.out.println("=== Grass Type (Polymorphism) ===");
                for (ParentPokemon p : team) {
                    System.out.println("Pokemon: " + p.getName());
                    p.attack();
                    System.out.println();
                }
                break;



               default:
                System.out.println("Invalid choice.");

        }

        sc.close();
    }
}