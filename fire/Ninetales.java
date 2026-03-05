package fire;

public class Ninetales {

    private String name = "Ninetales";
    private String color = "Gold";
    private int speed = 6;
    private int specialDefense = 6;


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

	
	// behavior 1 - psychic power
    	public void usePsychicPower(){
       		System.out.println(name + " uses psychic power to control minds!");
    	}

	// behavior 2 - understands human speech
    	public void castCurse(){
        	System.out.println(name + " can cast curses!");
    	}