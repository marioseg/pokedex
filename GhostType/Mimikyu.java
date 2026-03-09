package GhostType;

public class Mimikyu {

private String name ;
private String type;
private int speed;
private int level;

public Mimikyu (String name,String type,int speed,int level) {

this.name =name;
this.type =type;
this.speed=speed;
this.level=level;
}

//behaviours -   Mimikyu — Shy, attacks if its disguise is threatened

public void shy(){
System.out.println(name +"'s shy " + type );

}

public void fast(){

System.out.println(name +"'s fast  " + speed + "of pokemon " +type );

}

public void threatened() {

System.out.println(name +"'s attacks if its disguise is threatened " + speed + " and it's " + level+"of pokemon " +type );

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