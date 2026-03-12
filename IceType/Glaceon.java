package IceType;
import java.util.Scanner;

public class Glaceon 
 {
    private String name;
    private int level;
    private int temperature;
    private int distanceFromOthers;

    public Glaceon(String name, int level, int temperature, int distanceFromOthers) {
        this.name = name;
        this.level = level;
        this.temperature = temperature;
        this.distanceFromOthers = distanceFromOthers;
    }

    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getLevel() { return level; }
    public void setLevel(int level) { this.level = level; }

    public int getTemperature() { return temperature; }
    public void setTemperature(int temperature) { this.temperature = temperature; }

    public int getDistanceFromOthers() { return distanceFromOthers; }
    public void setDistanceFromOthers(int distanceFromOthers) { this.distanceFromOthers = distanceFromOthers; }

    // Unique Behaviours
    public void freezeAir() {
        System.out.println(name + " freezes the air around silently");
    }

    public void keepDistance() {
        if (distanceFromOthers > 5)
            System.out.println(name + " keeps a safe emotional distance.");
        else
            System.out.println(name + " is unusually close today.");
    }
}
