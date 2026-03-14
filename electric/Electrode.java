package electric;

public class Electrode {

	private String name = "Electrode";
	private String type = "Electric";
	private String color = "Orange";
	private String evolution = "Final";

	public String getName() {
		return this.name;
	}

	public void showDetails() {
		System.out.println("The details are name is " + name + "type is " + type + "color is " + color + ",and evolution is " + evolution);
	}


}
