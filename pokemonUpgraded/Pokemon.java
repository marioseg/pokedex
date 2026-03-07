package pokemonUpgraded;
import java.util.Scanner;
class Pokemon {
  private String name;
  private String type1;
  private String type2;
  private String weaknesses;

//Constructor
public Pokemon(String name, String type1, String type2, String weaknesses) {
  this.name = name;
  this.type1 = type1;
  this.type2 = type2;
  this.weaknesses = weaknesses;
}

//Getter for name
public String getName() {
  return name;
}

//Getter for Weaknesses
public String getWeaknesses() {
  return weaknesses;
}

//Setter for name
public void setname(String name) {
  this.name = name;
}

//Behavior 1: Display Pokemon details
public void displayDetails() {
  System.out.println("Name of Pokemon is: " + name);
  System.out.println("Type1 of Pokemon is: " + type1);
  System.out.println("Type2 of Pokemon is: " + (type2.isEmpty() ? "None" :type2));
  System.out.println("Weaknesses of Pokemon is: " + weaknesses);
}

//Behavior 2: For displaying Pokemon's strength

}


     

