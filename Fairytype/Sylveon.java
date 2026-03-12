package Fairytype;

public class Sylveon {

    private String name;
    private int affection;
    private int defense;
    private int threatLevel;

    public Sylveon(String name, int affection, int defense, int threatLevel) {
        this.name = name;
        this.affection = affection;
        this.defense = defense;
        this.threatLevel = threatLevel;
    }

    // Behaviour 1: <
    public void checkThreat() {
        if (threatLevel < 30) {
            System.out.println(name + " stays calm and sweet.");
        } else {
            System.out.println(name + " becomes fiercely protective!");
        }
    }

    // Behaviour 2: >=
    public void checkDefenseBoost() {
        if (defense >= 80) {
            System.out.println(name + " has strong protective power.");
        } else {
            System.out.println(name + " needs to boost defense.");
        }
    }

    // Getters & Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAffection() { return affection; }
    public void setAffection(int affection) { this.affection = affection; }

    public int getDefense() { return defense; }
    public void setDefense(int defense) { this.defense = defense; }

    public int getThreatLevel() { return threatLevel; }
    public void setThreatLevel(int threatLevel) { this.threatLevel = threatLevel; }
}  