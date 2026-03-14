package electric;

public class Raichu {

	private String name = "Raichu";
	private String type = "Electriv";
	private String color = "Blue";
	private String evolution = "Final";

	public String getName() {
		return this.name;
	}

	public void showDetails() {
		System.out.println("The details are name is " + name + "type is " + type + "color is " + color + ",and evolution is " + evolution);
	}


}