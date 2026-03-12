package FightingType;

public class IronValiant {

    private String name;
    private int level;
    private int speed;
    private int elegance;

    public IronValiant(String name, int level, int speed, int elegance) {
        this.name = name;
        this.level = level;
        this.speed = speed;
        this.elegance = elegance;
    }

    // Unique behaviours using arithmetic operators
    public void spiritBreak() {
        int impact = speed / 2; // division
        System.out.println(name + " performs Spirit Break! Impact = " + impact);
    }

    public void stylishStrike() {
        int styleScore = elegance % 10; // modulus
        System.out.println(name + " attacks stylishly! Style score = " + styleScore);
    }

    // Getters + Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getLevel() { return level; }
    public void setLevel(int level) { this.level = level; }

    public int getSpeed() { return speed; }
    public void setSpeed(int speed) { this.speed = speed; }

    public int getElegance() { return elegance; }
    public void setElegance(int elegance) { this.elegance = elegance; }
}