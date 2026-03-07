package pokemonUpgraded;
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Pokemon[] pokemons = PokemonInfo.getPokemons();
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the Pokemon name: ");
    String inputName = scanner.nextLine().trim();

    //Main functions starts here
    boolean found = false;
    for ( int i = 0; i < pokemons.length; i++) {
      if (pokemons[i].getName().equalsIgnoreCase(inputName)) {
        String weaknesses = pokemons[i].getWeaknesses();
        String appropriateType = "Unknown";

        // Guessing type based on weaknesses
        if (weaknesses.equalsIgnoreCase("Electric/Grass")) {
          appropriateType = "Water";
        } else if (weaknesses.equalsIgnoreCase("Water/Rock/Ground")) {
          appropriateType = "Fire";
        } else if (weaknesses.equalsIgnoreCase("Water/Grass/Ice")) {
          appropriateType = "Ground";
        } else if (weaknesses.equalsIgnoreCase("Steel/Poison")) {
          appropriateType = "Fairy";
        } else if (weaknesses.equalsIgnoreCase("Dragon/Fairy")) {
          appropriateType = "Dragon";
        } else if (weaknesses.equalsIgnoreCase("Ground/Psychic")) {
          appropriateType = "Poison";
        } else if (weaknesses.equalsIgnoreCase("Ground")) {
          appropriateType = "Electric";
        } else if (weaknesses.equalsIgnoreCase("Fire/Ice/Flying/Bug")) {
          appropriateType = "Grass";
        } else if (weaknesses.equalsIgnoreCase("Fire/Flying/Rock")) {
          appropriateType = "Bug";
        } else if (weaknesses.equalsIgnoreCase("Fighting")) {
          appropriateType = "Normal";
        } else if (weaknesses.equalsIgnoreCase("Bug/Ghost/Dark")) {
          appropriateType = "Psychic";
        } 
        System.out.println("Type of the Pokemon: " + inputName + " is: " + appropriateType);
        System.out.println("Entire details of the inputed Pokemon is: " );
        pokemons[i].displayDetails();
        found = true;
        break;
      }
    }
    if (!found) {
      System.out.println("Pokemon not found in the list.");
    }
    scanner.close();
  }
  
}
   
