package Fairytype;

public class Hatterene {

    private String name;
    private int noiseLevel;
    private int angerLevel;
    private boolean isCalm;

    public Hatterene(String name, int noiseLevel, int angerLevel, boolean isCalm) {
        this.name = name;
        this.noiseLevel = noiseLevel;
        this.angerLevel = angerLevel;
        this.isCalm = isCalm;
    }

    // Behaviour 1: >
    public void detectNoise() {
        if (noiseLevel > 50) {
            System.out.println(name + " becomes angry due to loud noise!");
        } else {
            System.out.println(name + " stays silent and calm.");
        }
    }

    // Behaviour 2: ==
    public void checkCalmState() {
        if (isCalm == true) {
            System.out.println(name + " is meditating quietly.");
        } else {
            System.out.println(name + " is ready to punish aggression.");
        }
    }

    // Getters & Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getNoiseLevel() { return noiseLevel; }
    public void setNoiseLevel(int noiseLevel) { this.noiseLevel = noiseLevel; }

    public int getAngerLevel() { return angerLevel; }
    public void setAngerLevel(int angerLevel) { this.angerLevel = angerLevel; }

    public boolean getIsCalm() { return isCalm; }
    public void setIsCalm(boolean isCalm) { this.isCalm = isCalm; }
}