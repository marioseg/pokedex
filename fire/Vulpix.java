package fire;

public class Vulpix {

    private String name = "Vulpix";
    private String color = "Orange";
    private int speed = 4;
    private int specialDefense = 4;


	// color getter
    	public String getColor(){
        	return color;
	}

	// color setter
	public void setColor(String color){
        	this.color = color;
    	}

	// name getter
	public String getName( ){ 
		return name; 
	}

	// name setter
    	public void setName(String name) { 
		this.name = name; 
	}


	// speed getter
	public int getSpeed() { 
		return speed; 
	}

	// speed setter
	public void setSpeed(int speed) { 
		this.speed = speed; 
	}

	// special defense getter
	public int getSpecialDefense() { 
		return specialDefense; 
	}

	// special defence setter
	public void setSpecialDefense(int specialDefense) { 
		this.specialDefense = specialDefense; 
	}

	
	// behavior 1 - willowisp
    	public void createWillOWisp(){
       		System.out.println(name + " creates a will-o-wisp!");
    	}

	// behavior 2 - follows trainer
    	public void followTrainer(){
        	System.out.println(name + " follows its trainer closely.");
    	}