package pokemonUpgraded;

public abstract class Pokemon {

    private String name;
    private String type1;
    private String type2;
    private String weaknesses;

    // Constructor
    public Pokemon(String name, String type1, String type2, String weaknesses) {
        this.name = name;
        this.type1 = type1;
        this.type2 = type2;
        this.weaknesses = weaknesses;
    }

    // Setter
    public void setName(String name) {
    this.name = name;
    }

   //Getter
   public String getType1() {
        return type1;
    }

   public String getType2() {
        return type2;
    }

    public String getWeaknesses() {
        return weaknesses;
    }

    // Display basic details
    public void displayDetails() {
        System.out.println("Pokemon Name: " + name);
        System.out.println("Type1: " + type1);
        System.out.println("Type2: " + (type2.isEmpty() ? "None" : type2));
        System.out.println("Weaknesses: " + weaknesses);
    }

    // Each Pokemon implements its own ability
    public abstract void specialAbility();
}