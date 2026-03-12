package FightingType;

public class Machamp {

    private String name;
    private int level;
    private int strength;
    private int arms;

    public Machamp(String name, int level, int strength, int arms) {
        this.name = name;
        this.level = level;
        this.strength = strength;
        this.arms = arms;
    }

    // Unique behaviours using arithmetic operators
    public void dynamicPunch() {
        int damage = strength * 2; // multiplication
        System.out.println(name + " uses Dynamic Punch! Damage = " + damage);
    }

    public void train() {
        strength += 5; // addition
        level++;       // increment
        System.out.println(name + " trained! Strength = " + strength + ", Level = " + level);
    }

    // Getters + Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getLevel() { return level; }
    public void setLevel(int level) { this.level = level; }

    public int getStrength() { return strength; }
    public void setStrength(int strength) { this.strength = strength; }

    public int getArms() { return arms; }
    public void setArms(int arms) { this.arms = arms; }
}