package pokemonUpgraded.pokemons;
import pokemonUpgraded.Pokemon;

public class Venusaur extends Pokemon {

    public Venusaur() {
        super("Venusaur", "Grass", "Poison", "Fire/Ice/Flying/Psychic");
    }

    public void specialAbility() {
        System.out.println("Solar Beam");
    }
}