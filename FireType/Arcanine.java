package FireType;

public class Arcanine {

String name = "Arcanine";
String type = "FireType";
int speed =90;
int HP =260;
String color = "Red";

public boolean isFast() //setter//

{
    return speed > 80;
}


public String getdesc () // Getter// 
{

return name + " is a Loyal, brave, acts like a noble guardian " + type + " Pokémon2, at Hitpoints " + HP + ".";
}

public int getrunspeed (){

return speed* HP ;
}

    public void displayColor() // setter//
{
        System.out.println( name +" has color "+ color + " Pokémon2.");
    }
}





