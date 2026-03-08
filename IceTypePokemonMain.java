package pokedexBindu;

import IceType.*;

import java.util.Scanner;

public class IceTypePokemonMain {
    public static void main(String[] args) {

        Glaceon glaceon = new Glaceon("Glaceon", 20, -10, 7);
        Froslass froslass = new Froslass("Froslass", 22, 10, true);
        Baxcalibur bax = new Baxcalibur("Baxcalibur", 30, 100, true);

        Scanner sc = new Scanner(System.in);

     
            System.out.println("Choose Pokemon (1-Glaceon, 2-Froslass, 3-Baxcalibur): ");
            int choice = sc.nextInt();

            do {
                if (choice == 1) {
                    glaceon.freezeAir();
                    glaceon.keepDistance();
                    break;
                } 
                else if (choice == 2) {
                    froslass.haunt();
                    froslass.sneak();
                    break;
                } 
                else if (choice == 3) {
                    bax.attack();
                    bax.roar();
                    break;
                } 
                else {
                    System.out.println("Invalid choice. Try again.");
                    break;
                }
            } while (false);

       



        sc.close();
    }
}