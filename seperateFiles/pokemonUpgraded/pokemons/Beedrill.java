package pokemonUpgraded.pokemons;
import pokemonUpgraded.Pokemon;

public class Beedrill extends Pokemon {

    public Beedrill() {
        super("Beedrill", "Bug", "Poison", "Fire/Flying/Psychic");
    }

    public void specialAbility() {
        System.out.println("Twin Needle");
    }
}