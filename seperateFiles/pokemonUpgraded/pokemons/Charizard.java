package pokemonUpgraded.pokemons;
import pokemonUpgraded.Pokemon;

public class Charizard extends Pokemon {

    public Charizard() {
        super("Charizard", "Fire", "Flying", "Water/Rock/Electric");
    }

    public void specialAbility() {
        System.out.println("Inferno Blast");
    }
}