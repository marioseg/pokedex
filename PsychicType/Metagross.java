package PsychicType;

public class Metagross {

private String name ;
private String type;
private int speed;
private int level;

public Metagross (String name,String type,int speed,int level) {

this.name =name;
this.type =type;
this.speed=speed;
this.level=level;
}

//behaviours

public void logical(){
System.out.println(name +"'s logically thinking pokemon of " + type );

}

public void robotic(){

System.out.println(name +"'s robotic calculational " + speed + "of pokemon " +type );

}

public void calculateEverything() {

System.out.println(name +"'s calculates Everything " + speed + " and it's " + level+"of pokemon " +type );

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