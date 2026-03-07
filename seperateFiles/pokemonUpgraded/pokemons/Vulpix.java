package pokemonUpgraded.pokemons;
import pokemonUpgraded.Pokemon;

public class Vulpix extends Pokemon {

    public Vulpix() {
        super("Vulpix", "Fire", "", "Water/Rock/Ground");
    }

    public void specialAbility() {
        System.out.println("Fire Spin");
    }
}