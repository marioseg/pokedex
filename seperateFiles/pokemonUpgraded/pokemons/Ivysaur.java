package pokemonUpgraded.pokemons;
import pokemonUpgraded.Pokemon;

public class Ivysaur extends Pokemon {

    public Ivysaur() {
        super("Ivysaur", "Grass", "Poison", "Fire/Ice/Flying/Psychic");
    }

    public void specialAbility() {
        System.out.println("Razor Leaf");
    }
}