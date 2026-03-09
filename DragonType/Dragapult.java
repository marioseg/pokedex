package DragonType;

public class Dragapult {

private String name ;
private String type;
private int speed;
private int level;

public Dragapult (String name,String type,int speed,int level) {

this.name =name;
this.type =type;
this.speed=speed;
this.level=level;
}

//behaviours -  Dragapult — Stealthy, fast, ghost‑like movement

public void stealthy(){
System.out.println(name +"'s Stealthy pokemon of " + type );

}

public void fast(){

System.out.println(name +"'s fast  " + speed + "of pokemon " +type );

}

public void movement() {

System.out.println(name +"'s ghost‑like movement " + speed + " and it's " + level+"of pokemon " +type );

}


//getters and setters 

public void setName (String name) { this.name =name;}
public String getName () {return name;}

public void setType (String type) { this.type =type;}
public String getType () {return type;}

public void setSpeed (int speed) {this.speed =speed;}
public int getSpeed () {return speed;}

public void setLevel (int level) {this.level= level;}
public int getLevel () {return level;}

}