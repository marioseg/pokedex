package pokemonUpgraded.pokemons;
import pokemonUpgraded.Pokemon;

public class Wartortle extends Pokemon {

    public Wartortle() {
        super("Wartortle", "Water", "", "Electric/Grass");
    }

    public void specialAbility() {
        System.out.println("Hydro Pump");
    }
}