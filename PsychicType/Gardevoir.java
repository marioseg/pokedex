package PsychicType;

public class Gardevoir {

private String Name ;
private String Type ;
private String Color;
private int Speed ;

public Gardevoir ( String Name,String Type,String Color,int Speed) {

this.Name = Name;
this.Type = Type;
this.Color = Color;
this.Speed = Speed;

}

public void kind(){
System.out.println(Name + " : This is a kind pokemon, of type:" +Type);
}

public void protective() {

System.out.println(Name + " :This is a protective pokemon of color: " +Color) ;
}

public void FightsHardForOthers(){

System.out.println (Name + " : this is a fights hard for others of speed: " +Speed) ;

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
