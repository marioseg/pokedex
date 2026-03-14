package glass;

public class Ivysaur {

	private String name = "Ivysaur";
	private String type = "Grass/Poison";
	private String color = "Lemon";
	private String evolution = "Venusaur";

	public String getName() {
		return this.name;
	}

	public void showDetails() {
		System.out.println("The details are name is " + name + "type is " + type + "color is " + color + ",and evolution is " + evolution);
	}


}
