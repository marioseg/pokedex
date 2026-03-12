package pokedexBindu.GrassType.ChildType;
import pokedexBindu.ParentPokemon;

public class Venusaur extends ParentPokemon {

    public Venusaur() {
        super("Venusaur", "Grass/Poison",390,50);
    }

    @Override
    public void attack() {
        super.attack();   // calls ParentPokemon.attack()

        System.out.println(getName() + " uses Solar Beam!<child override> ");
    }
}

