package pokemon;

public class Main {

    public static void main(String[] args) {

        for(int i = 1; i <= 151; i++) {

            // Create object using default constructor
            Pokemon p = new Pokemon();

            // Set values using setters
            p.setId(i);
            p.setName("Pokemon " + i);
            p.setPowerLevel(50 + i);

            // Assign unique type using simple condition
            if(i <= 30) {
                p.setType("Electric");
            }
            else if(i <= 60) {
                p.setType("Fire");
            }
            else if(i <= 90) {
                p.setType("Water");
            }
            else if(i <= 120) {
                p.setType("Grass");
            }
            else {
                p.setType("Psychic");
            }

            // Display and attack
            p.displayInfo();
            p.attack();

            System.out.println("------------------------");
        }
    }
}