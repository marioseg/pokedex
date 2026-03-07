package pokemonUpgraded.pokemons;
import pokemonUpgraded.Pokemon;

public class Pidgeot extends Pokemon {

    public Pidgeot() {
        super("Pidgeot", "Normal", "Flying", "Electric/Ice/Rock");
    }

    public void specialAbility() {
        System.out.println("Hurricane");
    }
}