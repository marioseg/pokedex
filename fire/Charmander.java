package fire;

public class Charmander {
    private String color = "Blue";
    private String name = "Charmander";
    private int healthPoint = 1;
    private String type = "fire";

    public void printColor(){
        System.out.println(color);
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void run(){
        System.out.println(name +" is running!!!!!");
    }
}
