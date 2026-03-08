package FightingType;

public class Lucario {

    private String name;
    private int level;
    private int auraPower;
    private int calmness;

    public Lucario(String name, int level, int auraPower, int calmness) {
        this.name = name;
        this.level = level;
        this.auraPower = auraPower;
        this.calmness = calmness;
    }

    // Unique behaviours using arithmetic operators
    public void auraSphere() {
        int blast = auraPower + 20; // addition
        System.out.println(name + " fires Aura Sphere! Power = " + blast);
    }

    public void meditate() {
        calmness *= 2; // multiplication
        System.out.println(name + " meditates. Calmness doubled to " + calmness);
    }

    // Getters + Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getLevel() { return level; }
    public void setLevel(int level) { this.level = level; }

    public int getAuraPower() { return auraPower; }
    public void setAuraPower(int auraPower) { this.auraPower = auraPower; }

    public int getCalmness() { return calmness; }
    public void setCalmness(int calmness) { this.calmness = calmness; }
}