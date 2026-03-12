package pokedexBindu;

public class ParentPokemon {

    private String name;
    private String type;
    private int hp;
    private int speed;

    public ParentPokemon(String name, String type, int hp, int speed) {
        this.name = name;
        this.type = type;
        this.hp = hp;
        this.speed = speed;
    }

    public String getName() { return name; }
    public String getType() { return type; }
    public int getHp() { return hp; }
    public int getSpeed() { return speed; }

    // Parent behaviour
    public void attack() {
        System.out.println(name + " attacks with a basic move!<parent message>");
    }
}
