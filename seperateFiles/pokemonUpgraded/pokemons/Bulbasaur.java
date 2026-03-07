package pokemonUpgraded.pokemons;
import pokemonUpgraded.Pokemon;

public class Bulbasaur extends Pokemon {

    public Bulbasaur() {
        super("Bulbasaur", "Grass", "Poison", "Fire/Ice/Flying/Psychic");
    }

    public void specialAbility() {
        System.out.println("Vine Whip");
    }
}