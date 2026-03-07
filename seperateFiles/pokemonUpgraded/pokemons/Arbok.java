package pokemonUpgraded.pokemons;
import pokemonUpgraded.Pokemon;

public class Arbok extends Pokemon {

    public Arbok() {
        super("Arbok", "Poison", "", "Ground/Psychic");
    }

    public void specialAbility() {
        System.out.println("Poison Fang");
    }
}