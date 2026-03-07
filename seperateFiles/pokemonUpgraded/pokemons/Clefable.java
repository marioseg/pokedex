package pokemonUpgraded.pokemons;
import pokemonUpgraded.Pokemon;

public class Clefable extends Pokemon {

    public Clefable() {
        super("Clefable", "Fairy", "", "Steel/Poison");
    }

    public void specialAbility() {
        System.out.println("Moonblast");
    }
}