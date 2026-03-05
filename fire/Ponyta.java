package fire;

public class Ponyta {

    private String name = "Ponyta";
    private String color = "Yellow";
    private String appearance = "Flame tail"
    private int speed = 6;


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


	// speed getter
	public int getSpeed() { 
		return speed; 
	}

	// speed setter
	public void setSpeed(int speed) { 
		this.speed = speed; 
	}

	
	// behavior 1 - chases parents
    	public void chases(){
       		System.out.println(name + " chases after it's parents to strengthen its legs");
    	}

	// behavior 2 - leaping
    	public void leap(){
        	System.out.println(name + " leaps over tall buildings");
    	}