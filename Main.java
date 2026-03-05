import electric.Pikachu;
import fire.Vulpix;
import fire.Ninetales;
import fire.Growlithe;
import fire.Arcanine;
import fire.Ponyta;
import fire.Rapidash;

public class Main{

	public static void main(String...args){

		Pikachu p = new Pikachu();

		p.getName();


		// Create & Test Vulpix object
        	Vulpix vpx = new Vulpix();
        	System.out.println("Name: " + vpx.getName());
		vpx.createWillOWisp();
        	vpx.followTrainer();

    
        	// Create & Test Ninetales object
        	Ninetales nt = new Ninetales();
        	System.out.println("Name: " + nt.getName());
        	nt.usePsychicPower();
        	nt.castCurse();

       
        	// Create & Test Growlithe object
        	Growlithe growlithe = new Growlithe();
       		System.out.println("Name: " + growlithe.getName());
        	growlithe.guard();
        	growlithe.sniff();

    
        	// Create & Test Arcanine object
        	Arcanine arcanine = new Arcanine();
        	System.out.println("Name: " + arcanine.getName());
        	arcanine.extremeSpeed();
        	arcanine.blaze();

        	// Create & Test Ponyta object
        	Ponyta pny = new Ponyta();
        	System.out.println("Name: " + pny.getName());
        	pny.chase();
        	pny.leap();
		
        	// Create & Test Rapidash object
        	Rapidash rpd = new Rapidash();
        	System.out.println("Name: " + rpd.getName());
        	rpd.gallop();
        	rpd.accelerate();
    
		
	}
	
}