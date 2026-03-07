package  PsychicType;

public class Alakazam {

private String name ="Alakazam";

private String color ="White";

private  int speed = 300;

private int level =100;

public Alakazam ( String name,String color,int speed,int level){

this.name =name;
this.color =color;
this.speed =speed;
this.level= level;

}

//unique behaviours 



public void supersmart (){

System.out.println(name + "Supersmart behaviour with Speed" + speed);

}

public void avoidsPhysicalFights() {

System.out.println (name + "avoids physical fights with level" + level + " , indicated with peace color " + color) ;

}

// getters and setters 

   public String getName() { return name; }
   public void setName(String name) { this.name = name; }

    public String getColor() { return color; }
    public void setcolor(String color) { this.color = color; }

    public int getSpeed() { return speed; }
    public void setSpeed(int speed) { this.speed = speed; }

    public int getLevel() { return level;}
    public void setLevel(int level) { this.level= level; } }
