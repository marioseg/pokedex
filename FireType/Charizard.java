package FireType;

public class Charizard {

// 4 attribute type

 String Name = "Charizard"; 
 String Type = "Fire-type";
 int Level =100 ;
 int HP = 360 ;  

// 4 behaviour type

    public void display() 
{
        System.out.println( Name +" is a Hot headed, proud, loves battling " + Type + " Pokémon1.");
    }

	public void roar () 

	{
	System.out.println(Name +" got a powerful roar.");
	}
	public void displayrunLevel ()
	{
	System.out.println(Name +" can run "+ Level*Level + " meters per secound - Super Faster.");
	}

	public void hitpoints ()
	{
	System.out.println(Name +" got Hitpoints "+ HP +".");

	}
public int getrunLevel (){

return Level* HP ;
}
}
