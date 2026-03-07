package pokemonUpgraded.pokemons;
import pokemonUpgraded.Pokemon;

public class Pidgey extends Pokemon {

    public Pidgey() {
        super("Pidgey", "Normal", "Flying", "Electric/Ice/Rock");
    }

    public void specialAbility() {
        System.out.println("Gust");
    }
}