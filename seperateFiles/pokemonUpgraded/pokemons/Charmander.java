package pokemonUpgraded.pokemons;
import pokemonUpgraded.Pokemon;

public class Charmander extends Pokemon {

    public Charmander() {
        super("Charmander", "Fire", "", "Water/Rock/Ground");
    }

    public void specialAbility() {
        System.out.println("Flamethrower");
    }
}