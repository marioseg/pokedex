package pokemonUpgraded.pokemons;
import pokemonUpgraded.Pokemon;

public class Charmeleon extends Pokemon {

    public Charmeleon() {
        super("Charmeleon", "Fire", "", "Water/Rock/Ground");
    }

    public void specialAbility() {
        System.out.println("Fire Fang");
    }
}