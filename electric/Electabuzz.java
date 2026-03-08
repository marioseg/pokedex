package electric;

public class Electabuzz {

	private String name = "Electabuzz";
	private String type = "Electric";
	private String color = "Yellow";
	private String evolution = "Final";

	public String getName() {
		return this.name;
	}

	public void showDetails() {
		System.out.println("The details are name is " + name + "type is " + type + "color is " + color + ",and evolution is " + evolution);
	}


}
