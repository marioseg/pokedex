package pokemonUpgraded;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Pokemon name:");
        String name = scanner.nextLine();

        Pokemon pokemon = PokemonFactory.getPokemon(name);

        if (pokemon == null) {
            System.out.println("Pokemon not found.");
            scanner.close();
            return;
        }

        System.out.println("Choose an option:");
        System.out.println("1. Show full details");
        System.out.println("2. Show special ability");

        int choice = scanner.nextInt();

        if (choice == 1) {
            pokemon.displayDetails();
        }
        else if (choice == 2) {
            pokemon.specialAbility();
        }
        else {
            System.out.println("Invalid option.");
        }

        scanner.close();
    }
}