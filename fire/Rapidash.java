package fire;

public class Rapidash {

    private String name = "Rapidash";
    private String color = "Yellow";
    private String appearance = "Pointed horn on head";
    private String evolvesFrom = "Ponyta;


	// name getter
	public String getName( ){ 
		return name; 
	}

	// name setter
    	public void setName(String name) { 
		this.name = name; 
	}

	// color getter
    	public String getColor(){
        	return color;
	}

	// color setter
	public void setColor(String color){
        	this.color = color;
    	}

	// appearance getter
    	public String getAppearance(){
        	return appearance;
	}

	// appearance setter
	public void setAppearance(String appearance){
        	this.appearance = appearance;
    	}


	// evolves from getter
	public int getEvolvesFrom() { 
		return evolvesFrom; 
	}

	// evolves from setter
	public void setEvolvesFrom(int evolvesFrom) { 
		this.evolvesFrom = evolvesFrom; 
	}

	
	// behavior 1 - gallops
    	public void gallop(){
       		System.out.println(name + "gallops at nearly 150 mph!");
    	}

	// behavior 2 - acceleration
    	public void accelerate(){
        	System.out.println(name + " can reach top speed within 10 steps!");
    	}