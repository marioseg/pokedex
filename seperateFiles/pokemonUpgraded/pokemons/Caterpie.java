package pokemonUpgraded.pokemons;
import pokemonUpgraded.Pokemon;

public class Caterpie extends Pokemon {

    public Caterpie() {
        super("Caterpie", "Bug", "", "Fire/Flying/Rock");
    }

    public void specialAbility() {
        System.out.println("String Shot");
    }
}