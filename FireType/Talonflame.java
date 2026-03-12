package FireType;

public class Talonflame {

String name = "Talonflame";
String type = "FireType";
int speed =90;
int Hp =123;
String Color ="Yellow";


public String getdesc(){

return name + "is a Fast, sharp, hits quickly then backs off " + type +" Pokémon 3 . " + Hp + " got hit points.";

}

public Boolean isfast() {

return speed >= 100 && speed <= 120;
 
}
    public void displayColor() // setter//
{
        System.out.println( name +" has color "+Color+" Pokémon3.");
    }
}