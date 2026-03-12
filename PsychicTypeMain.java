package pokedexBindu;
import PsychicType.*;

public class  PsychicTypeMain {

public static void main (String[]args) {

Alakazam a = new Alakazam("Alakazam","white",120,134);
Gardevoir g= new Gardevoir("Gardevoir","Psychic","Yellow",123);
Metagross m= new Metagross("Metagross","Psychic",123,45);


System.out.println ("Name:" + a.getName());
System.out.println ("Color:" + a.getColor());
System.out.println("Speed:" + a.getSpeed());
System.out.println("Level:" + a.getLevel());

a.supersmart ();
a.avoidsPhysicalFights();

System.out.println ("Name:" + g.getName());
System.out.println ("Type:" + g.getColor());
System.out.println ("Color:" + g.getType());
System.out.println("Speed:" + g.getSpeed());


g.kind();
g.protective();
g.FightsHardForOthers();

System.out.println ("Name:" + m.getName());
System.out.println ("Type:" + m.getType());
System.out.println("Speed:" + a.getSpeed());
System.out.println("Level:" + a.getLevel());

m.logical();
m.robotic();
m.calculateEverything();

}
}
