package electric;

public class Voltorb {

	private String name = "Voltorb";
	private String type = "Electric";
	private String color = "Red";
	private String evolution = "Electrode";

	public String getName() {
		return this.name;
	}

	public void showDetails() {
		System.out.println("The details are name is " + name + "type is " + type + "color is " + color + ",and evolution is " + evolution);
	}


}
