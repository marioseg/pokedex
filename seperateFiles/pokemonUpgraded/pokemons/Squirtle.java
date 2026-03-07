package pokemonUpgraded.pokemons;
import pokemonUpgraded.Pokemon;

public class Squirtle extends Pokemon {

    public Squirtle() {
        super("Squirtle", "Water", "", "Electric/Grass");
    }

    public void specialAbility() {
        System.out.println("Water Gun");
    }
}