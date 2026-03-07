package pokemon;

public class Pokemon {

    // 4 Attributes
    private int id;
    private String name;
    private String type;
    private int powerLevel;

    // Default Constructor (No parameters)
    public Pokemon() {
    }

    // 1 Getter
    public String getName() {
        return name;
    }

    // 1 Setter (required)
    public void setPowerLevel(int powerLevel) {
        this.powerLevel = powerLevel;
    }

    // Extra setters to assign values
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    // Behaviour 1
    public void attack() {
        System.out.println(name + " attacks with power " + powerLevel + "!");
    }

    // Behaviour 2
    public void displayInfo() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Power Level: " + powerLevel);
    }
}