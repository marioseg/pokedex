package DragonType;

public class  Salamence {

private String Name ;
private String Type ;
private String Color;
private int Speed ;

public  Salamence ( String Name,String Type,String Color,int Speed) {

this.Name = Name;
this.Type = Type;
this.Color = Color;
this.Speed = Speed;

}


public void fierce(){
System.out.println(Name + " : This is a Fierce pokemon, of type:" +Type);
}

public void lovesFlyingFast() {

System.out.println(Name + " :This is a loves flying fast pokemon of color: " +Color) ;
}

public void veryAggressives(){

System.out.println (Name + " : this is a very aggressive hard for others of speed: " +Speed) ;

}

//Getter and setter

public void setName (String Name) {this.Name= Name;}
public String getName() { return Name; }

public void setType (String Type) {this.Type= Type;}
public String getType() { return Type;}

public void setColor (String Color) {this.Color= Color;}
public String getColor() { return Color; }

public void setSpeed (int Speed) {this.Speed= Speed;}
public int getSpeed() { return Speed ;}
}
