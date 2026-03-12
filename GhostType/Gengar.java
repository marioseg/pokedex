package  GhostType;

public class Gengar {

private String name ="Gengar";

private String color ="Pink";

private  int speed = 400;

private int level =500;

public Gengar ( String name,String color,int speed,int level){

this.name =name;
this.color =color;
this.speed =speed;
this.level= level;

}

//unique behaviours -Mischievous, loves pranks



public void mischievous(){

System.out.println(name + "Mischievous" + speed);

}

public void lovepranks() {

System.out.println (name + "love pranks with level" + level + " , indicated with color " + color) ;

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
