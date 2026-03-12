package pokedexBindu;



import pokedexBindu.WaterType.Blastoise;
import pokedexBindu.WaterType.Gyarados;
import pokedexBindu.WaterType.ChildPokemon.Milotic;

public class WaterPokemonMain {

public static void main(String[] args){
	Blastoise b = new Blastoise();
	System.out.println(b.getName());
	Boolean isfast=b.getSpeed() >50 ;
	b.displayColor();
	if (isfast) 
		System.out.println(b.getName() + " is moving faster,"+ b.getType() + "of pokemon with hit points : "+ b.getHP()+ "." );
	else 
		System.out.println(b.getName() + " is moving slower,"+ b.getType() + "of pokemon with hit points : " + b.getHP()*50+ ".");

	Gyarados g = new Gyarados();
	System.out.println ("getter is printing");
        System.out.println("Pokémon: " + g.getName());
        System.out.println("Type: " + g.getType());
        System.out.println("HP: " + g.getHp());
        System.out.println("Speed: " + g.getSpeed());
	System.out.println ("Unique behaviours is printing");
        // Unique behaviours
        g.intimidate();
        g.aquaTail();
	System.out.println ("METHOD OVERLOADING TEST");
        // ---------------- METHOD OVERLOADING TEST ----------------
        g.attack();                       // No parameters
        g.attack(90);                     // One parameter
        g.attack(120, "Charizard");       // Two parameters

	Milotic m = new Milotic();

        System.out.println("Pokémon: " + m.getName());
        System.out.println("Type: " + m.getType());
        System.out.println("HP: " + m.getHp());
        System.out.println("Speed: " + m.getSpeed());
        System.out.println("Color: " + m.getColor());

        // Overridden method
        m.attack();

        // Unique behaviour
        m.recover();

           }
}



     



