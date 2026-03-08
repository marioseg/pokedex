package electric;

public class Zapdos {

	private String name = "Zapdos";
	private String type = "Electric/Flying";
	private String color = "Red and yellow";
	private String evolution = "Legendary";

	public String getName() {
		return this.name;
	}

	public void showDetails() {
		System.out.println("The details are name is " + name + "type is " + type + "color is " + color + ",and evolution is " + evolution);
	}


}
