package pokemonUpgraded.pokemons;
import pokemonUpgraded.Pokemon;

public class Raichu extends Pokemon {

    public Raichu() {
        super("Raichu", "Electric", "", "Ground");
    }

    public void specialAbility() {
        System.out.println("Thunder Punch");
    }
}