package electric;

public class Magnemite {

	private String name = "Magnemite";
	private String type = "Electric/Steel";
	private String color = "Gray";
	private String evolution = "Final";

	public String getName() {
		return this.name;
	}

	public void showDetails() {
		System.out.println("The details are name is " + name + "type is " + type + "color is " + color + ",and evolution is " + evolution);
	}


}