package pokemonUpgraded.pokemons;
import pokemonUpgraded.Pokemon;

public class Weedle extends Pokemon {

    public Weedle() {
        super("Weedle", "Bug", "Poison", "Fire/Flying/Psychic");
    }

    public void specialAbility() {
        System.out.println("Poison Sting");
    }
}