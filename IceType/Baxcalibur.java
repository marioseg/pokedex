package IceType;
public class Baxcalibur 
 {
    private String name;
    private int level;
    private int power;
    private boolean predatorMode;

    public Baxcalibur(String name, int level, int power, boolean predatorMode) {
        this.name = name;
        this.level = level;
        this.power = power;
        this.predatorMode = predatorMode;
    }

    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getLevel() { return level; }
    public void setLevel(int level) { this.level = level; }

    public int getPower() { return power; }
    public void setPower(int power) { this.power = power; }

    public boolean isPredatorMode() { return predatorMode; }
    public void setPredatorMode(boolean predatorMode) { this.predatorMode = predatorMode; }

    // Unique Behaviours
    public void attack() {
        for (int i = 1; i <= 3; i++) {
            if (i == 2) continue;   // skip second strike
            System.out.println(name + " strikes fiercely! Hit " + i);
        }
    }

    public void roar() {
        int count = 0;
        while (count < 2) {
            System.out.println(name + " roars like a top predator"+ count + " before increment" );
            count++;
           System.out.println(name + " roars like a top predator"+ count+  " after increment" );
        }
    }
}
