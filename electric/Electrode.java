package electric;


public class Electrode{


	private String color = "orange";
	private String name = "Electrode";

	public void printName(){
		System.out.println(name);
	}

	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name = name;
	}

	
}
