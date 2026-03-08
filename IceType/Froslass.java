package IceType;

public class Froslass  {
    private String name;
    private int level;
    private int stealth;
    private boolean invisible;

    public Froslass(String name, int level, int stealth, boolean invisible) {
        this.name = name;
        this.level = level;
        this.stealth = stealth;
        this.invisible = invisible;
    }

    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getLevel() { return level; }
    public void setLevel(int level) { this.level = level; }

    public int getStealth() { return stealth; }
    public void setStealth(int stealth) { this.stealth = stealth; }

    public boolean isInvisible() { return invisible; }
    public void setInvisible(boolean invisible) { this.invisible = invisible; }

    // Unique Behaviours
    public void haunt() {
        System.out.println(name + " quietly haunts its opponent");
    }

    public void sneak() {
        switch (stealth) {
            case 10:
                System.out.println(name + " moves like a ghost in blizzard.");
                break;
            default:
                System.out.println(name + " attempts to sneak...");
        }
    }
}
