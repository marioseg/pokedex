package Darktype;

public class Umbreon {

    private String name;
    private int defense;
    private int patience;
    private boolean isAlert;

    public Umbreon(String name, int defense, int patience, boolean isAlert) {
        this.name = name;
        this.defense = defense;
        this.patience = patience;
        this.isAlert = isAlert;
    }

    // Behaviour 1: Equality operator
    public void checkAlertStatus() {
        if (isAlert == true) {
            System.out.println(name + " is quietly watching the surroundings.");
        } else {
            System.out.println(name + " is resting peacefully.");
        }
    }

    // Behaviour 2: Inequality operator
    public void compareDefense(int value) {
        if (defense != value) {
            System.out.println(name + "'s defense is different from " + value);
        } else {
            System.out.println(name + "'s defense matches " + value);
        }
    }

    // Getters & Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getDefense() { return defense; }
    public void setDefense(int defense) { this.defense = defense; }

    public int getPatience() { return patience; }
    public void setPatience(int patience) { this.patience = patience; }

    public boolean getIsAlert() { return isAlert; }
    public void setIsAlert(boolean isAlert) { this.isAlert = isAlert; }
}
