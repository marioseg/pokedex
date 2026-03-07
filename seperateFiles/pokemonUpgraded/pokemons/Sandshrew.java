package pokemonUpgraded.pokemons;
import pokemonUpgraded.Pokemon;

public class Sandshrew extends Pokemon {

    public Sandshrew() {
        super("Sandshrew", "Ground", "", "Water/Grass/Ice");
    }

    public void specialAbility() {
        System.out.println("Sand Attack");
    }
}