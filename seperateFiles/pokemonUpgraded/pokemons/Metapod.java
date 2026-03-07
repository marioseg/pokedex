package pokemonUpgraded.pokemons;
import pokemonUpgraded.Pokemon;

public class Metapod extends Pokemon {

    public Metapod() {
        super("Metapod", "Bug", "", "Fire/Flying/Rock");
    }

    public void specialAbility() {
        System.out.println("Harden");
    }
}