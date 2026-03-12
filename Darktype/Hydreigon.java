package Darktype;

public class Hydreigon {

    private String name;
    private int rage;
    private int power;
    private boolean isHungry;

    public Hydreigon(String name, int rage, int power, boolean isHungry) {
        this.name = name;
        this.rage = rage;
        this.power = power;
        this.isHungry = isHungry;
    }

    // Behaviour 1: Logical AND
    public void checkRampage() {
        if (rage > 70 && power > 80) {
            System.out.println(name + " is going on a violent rampage!");
        } else {
            System.out.println(name + " is dangerous but under control.");
        }
    }

    // Behaviour 2: Logical OR
    public void checkAggression() {
        if (isHungry || rage > 60) {
            System.out.println(name + " is getting aggressive!");
        } else {
            System.out.println(name + " is calm for now.");
        }
    }

    // Getters & Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getRage() { return rage; }
    public void setRage(int rage) { this.rage = rage; }

    public int getPower() { return power; }
    public void setPower(int power) { this.power = power; }

    public boolean getIsHungry() { return isHungry; }
    public void setIsHungry(boolean isHungry) { this.isHungry = isHungry; }
}