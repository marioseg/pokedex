package  DragonType;

public class Dragonite {

private String name ="Dragonite";

private String color ="Red";

private  int speed = 400;

private int level =500;

public Dragonite ( String name,String color,int speed,int level){

this.name =name;
this.color =color;
this.speed =speed;
this.level= level;

}

//unique behaviours 



public void superFriend (){

System.out.println(name + "Friendly but very strong when needed" + speed);

}

public void avoidsPhysicalFights() {

System.out.println (name + "avoids physical fights with level" + level + " , indicated with color " + color) ;

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
