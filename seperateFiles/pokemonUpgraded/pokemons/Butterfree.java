package pokemonUpgraded.pokemons;
import pokemonUpgraded.Pokemon;

public class Butterfree extends Pokemon {

    public Butterfree() {
        super("Butterfree", "Bug", "Flying", "Fire/Rock/Electric");
    }

    public void specialAbility() {
        System.out.println("Sleep Powder");
    }
}