package Darktype;

public class Grimmsnarl {

    private String name;
    private int intimidation;
    private int trickLevel;
    private boolean isSmiling;

    public Grimmsnarl(String name, int intimidation, int trickLevel, boolean isSmiling) {
        this.name = name;
        this.intimidation = intimidation;
        this.trickLevel = trickLevel;
        this.isSmiling = isSmiling;
    }

    // Behaviour 1: Conditional operator on boolean
    public void showExpression() {
        String mood = isSmiling ? "pretending to be friendly" : "looking menacing";
        System.out.println(name + " is " + mood + ".");
    }

    // Behaviour 2: Conditional operator on number
    public void trickChance() {
        String result = (trickLevel > 50)
                ? "high chance of tricking the opponent"
                : "low chance of tricking the opponent";
        System.out.println(name + " has a " + result + ".");
    }

    // Getters & Setters
    public String getName() { 
        return name; 
    }
    public void setName(String name) { 
        this.name = name; 
    }

    public int getIntimidation() { 
        return intimidation; 
    }
    public void setIntimidation(int intimidation) { 
        this.intimidation = intimidation; 
    }

    public int getTrickLevel() { 
        return trickLevel; 
    }
    public void setTrickLevel(int trickLevel) { 
        this.trickLevel = trickLevel; 
    }

    public boolean getIsSmiling() { 
        return isSmiling; 
    }
    public void setIsSmiling(boolean isSmiling) { 
        this.isSmiling = isSmiling; 
    }
}