package pokemonUpgraded.pokemons;
import pokemonUpgraded.Pokemon;

public class Sandslash extends Pokemon {

    public Sandslash() {
        super("Sandslash", "Ground", "", "Water/Grass/Ice");
    }

    public void specialAbility() {
        System.out.println("Slash");
    }
}