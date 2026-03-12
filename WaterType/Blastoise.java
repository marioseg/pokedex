package WaterType;

public class Blastoise {

private String name ="Blastoise"; // private - Encapsulation (private fields + getters/setters)//
private String type ="WaterType";
private int HP =360;
private int Speed=10;
String color = "Blue"; // default varibale // 

/*Encapsulation (Getters + Setters Concept)
 implemented:
- getters for all attributes
- a behaviour method (displayColor)
This shows:
- hiding data
- exposing data safely
- correct method signatures */


public String getName() {

return name; 
}


public String getType() {

return type; 
}


public int getHP() {

return HP; 
}

public int getSpeed() {

return Speed; 
}

    public void displayColor() // setter//
{
        System.out.println( name +" has color "+ color + " of WaterPokémon category.");
    }
}



