package glass;

public class Bulbasaur {

	private String name = "Bulbasaur";
	private String type = "Grass/Poison";
	private String color = "Green";
	private String evolution = "Ivysaur";

	public String getName() {
		return this.name;
	}

	public void showDetails() {
		System.out.println("The details are name is " + name + "type is " + type + "color is " + color + ",and evolution is " + evolution);
	}


}
