package pokedexBindu;

import pokedexBindu.ParentPokemon;
import pokedexBindu.WaterType.ChildPokemon.Milotic;
import pokedexBindu.GrassType.ChildType.Venusaur;

public class GrassTestPolymorphismMain {
    public static void main(String[] args) {

        ParentPokemon p1 = new Venusaur();   // parent reference → child object
        ParentPokemon p2 = new Milotic();    // parent reference → child object

        ParentPokemon[] team = { p1, p2 };

        for (ParentPokemon p : team) {
            System.out.println("Pokemon: " + p.getName());
            p.attack();   // calls the child’s overridden method
            System.out.println();
        }
    }
}