package pokemonUpgraded.pokemons;
import pokemonUpgraded.Pokemon;

public class Pidgeotto extends Pokemon {

    public Pidgeotto() {
        super("Pidgeotto", "Normal", "Flying", "Electric/Ice/Rock");
    }

    public void specialAbility() {
        System.out.println("Wing Attack");
    }
}