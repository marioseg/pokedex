package pokemonUpgraded.pokemons;
import pokemonUpgraded.Pokemon;

public class Ekans extends Pokemon {

    public Ekans() {
        super("Ekans", "Poison", "", "Ground/Psychic");
    }

    public void specialAbility() {
        System.out.println("Acid Spray");
    }
}