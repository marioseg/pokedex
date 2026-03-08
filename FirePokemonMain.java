package pokedexBindu;

import java.util.Scanner;

import FireType.*;


public class FirePokemonMain {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

        System.out.println("Choose a Pokémon:");
        System.out.println("1. Charizard");
        System.out.println("2. Arcanine");
        System.out.println("3. Talonflame");
        System.out.print("Enter your choice: ");

        int choice = sc.nextInt();

switch (choice) {

case 1 : 
        Charizard c = new Charizard();
        c.display();
        c.roar();
        c.displayrunLevel();
	c.hitpoints();
System.out.println("Level Run speed is "+ c.getrunLevel());
break;

case 2 : 
	Arcanine a = new Arcanine();
	System.out.println(a.getdesc());
	System.out.println("RunSpeed is " + a.getrunspeed());
	System.out.println("Is Arcanine fast? " + a.isFast());
        a.displayColor();
break;

case 3 : 
Talonflame t = new Talonflame();
System.out.println(t.getdesc());
System.out.println("Is Talonflame fast ? " + t.isfast());
t.displayColor();
break ;

default:
                System.out.println("Invalid Pokémon choice!");

}
sc.close();

    }
}

