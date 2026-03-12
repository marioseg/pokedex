package pokedexBindu.WaterType.ChildPokemon;

import pokedexBindu.ParentPokemon;

public class Milotic extends ParentPokemon {

    private String color = "Pearl White";

    public Milotic() {
        super("Milotic", "Water", 390, 81);
    }

    public String getColor() {
        return color;
    }

    // ---------------- OVERRIDING ----------------
    @Override
    public void attack() {
        super.attack();   // calls ParentPokemon.attack()

        System.out.println(getName() + " uses Hydro Pulse with elegance!< child override message");
    }

    // Unique behaviour
    public void recover() {
        System.out.println(getName() + " uses Recover to restore HP!");
    }
}
