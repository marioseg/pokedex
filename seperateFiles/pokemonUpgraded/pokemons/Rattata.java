package pokemonUpgraded.pokemons;
import pokemonUpgraded.Pokemon;

public class Rattata extends Pokemon {

    public Rattata() {
        super("Rattata", "Normal", "", "Fighting");
    }

    public void specialAbility() {
        System.out.println("Hyper Fang");
    }
}