package GhostType;

public class  Ceruledge {

private String Name ;
private String Type ;
private String Color;
private int Speed ;

public  Ceruledge ( String Name,String Type,String Color,int Speed) {

this.Name = Name;
this.Type = Type;
this.Color = Color;
this.Speed = Speed;

}
//behaviour Ceruledge — Serious, knight‑like, fights with honour

public void serious(){
System.out.println(Name + " : This is a Serious pokemon, of type:" +Type);
}

public void knight() {

System.out.println(Name + " :This is a loves knight‑like fast pokemon of color: " +Color) ;
}

public void fightswithhonour(){

System.out.println (Name + " : this is a fights with honour and hard for others of speed: " +Speed) ;

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
