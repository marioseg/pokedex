package pokemonUpgraded.pokemons;

import pokemonUpgraded.Pokemon;

public class Pikachu extends Pokemon {

    public Pikachu() {
        super("Pikachu", "Electric", "", "Ground");
    }

    @Override
    public void specialAbility() {
        System.out.println("Thunderbolt");
    }
}