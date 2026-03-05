package fire;

public class Arcanine {

    private String name = "Arcanine";
    private String appearance = "Orange with the mane of a lion and the stripes of a tiger";
    private String evolvesFrom = "Growlithe;
    private int speed = 6;


	// appearance getter
    	public String getAppearance(){
        	return appearance;
	}

	// appearance setter
	public void setAppearance(String appearance){
        	this.appearance = appearance;
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

	// evolves from getter
	public int getEvolvesFrom() { 
		return evolvesFrom; 
	}

	// evolves from setter
	public void setEvolvesFrom(int evolvesFrom) { 
		this.evolvesFrom = evolvesFrom; 
	}

	
	// behavior 1 - extreme speed
    	public void extremeSpeed(){
       		System.out.println(name + " dashs at incredible speed!");
    	}

	// behavior 2 - blaze
    	public void blaze(){
        	System.out.println(name + " unleashes blazing fire!");
    	}