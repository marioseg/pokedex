package fire;

public class Growlith {

    private String name = "Growlithe";
    private String color = "Orange with black stripes";
    private int attack = 5;
    private int specialAttack = 5;


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


	// attack stats getter
	public int getAttackLevel() { 
		return attack; 
	}

	// attack stats setter
	public void setAttackLevel(int attack) { 
		this.attack = attack; 
	}

	// special attack getter
	public int getSpecialAttack() { 
		return specialAttack; 
	}

	// special defence setter
	public void setSpecialAttack(int specialAttack) { 
		this.specialAttack = specialAttack; 
	}

	
	// behavior 1 - intimidates attackers
    	public void guard(){
       		System.out.println(name + " stands guard loyally.");
    	}

	// behavior 2 - obeys trainer
    	public void sniff(){
        	System.out.println(name + " sniffs the air with its strong sense of smell.");
    	}