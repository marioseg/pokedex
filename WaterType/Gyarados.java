package WaterType;
public class Gyarados{

private String name ="Gyarados";
private String type = "WaterTytpe";
private int speed =123;
private int hp=12;

public String getName(){
return name;
}
public String getType(){
return type;
}
public int getSpeed(){
return speed;
}

public int getHp(){
return hp;
}

public void setName(String name){
System.out.println("Setter is printing");
this.name =name ; 

}

public void settype(String type){
this.type =type ;
}

public void sethp(int hp){
this.hp=hp;
}

public void setspeed(int speed){
this.speed=speed;

}

   // ---------------- UNIQUE BEHAVIOURS ----------------
    public void intimidate() {
        System.out.println(name + " intimidates the opponent with a fierce glare!");
    }

    public void aquaTail() {
        System.out.println(name + " strikes with a powerful Aqua Tail!");
    }

    // ---------------- METHOD OVERLOADING ----------------
    // 1. Basic attack
    public void attack() {

System.out.println ("Overload = same method name, different signature.");
        System.out.println(name + " attacks with a basic water strike!");
    }

    // 2. Attack with power level
    public void attack(int power) {
        System.out.println(name + " attacks with power level " + power + "!");
    }

    // 3. Attack with power + target
    public void attack(int power, String target) {
        System.out.println(name + " attacks " + target + " with power " + power + "!");
    }
}

 

