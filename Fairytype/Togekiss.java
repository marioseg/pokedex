package Fairytype;

public class Togekiss {

    private String name;
    private int peaceLevel;
    private int aggressionAround;
    private boolean isFlying;

    public Togekiss(String name, int peaceLevel, int aggressionAround, boolean isFlying) {
        this.name = name;
        this.peaceLevel = peaceLevel;
        this.aggressionAround = aggressionAround;
        this.isFlying = isFlying;
    }

    // Behaviour 1: <=
    public void checkEnvironment() {
        if (aggressionAround <= 20) {
            System.out.println(name + " spreads peace and happiness.");
        } else {
            System.out.println(name + " avoids conflict and flies away.");
        }
    }

    // Behaviour 2: !=
    public void checkFlightStatus() {
        if (isFlying != true) {
            System.out.println(name + " is resting on the ground.");
        } else {
            System.out.println(name + " is peacefully gliding in the sky.");
        }
    }

    // Getters & Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getPeaceLevel() { return peaceLevel; }
    public void setPeaceLevel(int peaceLevel) { this.peaceLevel = peaceLevel; }

    public int getAggressionAround() { return aggressionAround; }
    public void setAggressionAround(int aggressionAround) { this.aggressionAround = aggressionAround; }

    public boolean getIsFlying() { return isFlying; }
    public void setIsFlying(boolean isFlying) { this.isFlying = isFlying; }
}