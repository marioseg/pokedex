package pokemonUpgraded.pokemons;
import pokemonUpgraded.Pokemon;

public class Kakuna extends Pokemon {

    public Kakuna() {
        super("Kakuna", "Bug", "Poison", "Fire/Flying/Psychic");
    }

    public void specialAbility() {
        System.out.println("Iron Defense");
    }
}