package pokemonUpgraded.pokemons;
import pokemonUpgraded.Pokemon;

public class Blastoise extends Pokemon {

    public Blastoise() {
        super("Blastoise", "Water", "", "Electric/Grass");
    }

    public void specialAbility() {
        System.out.println("Hydro Cannon");
    }
}