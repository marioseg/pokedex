import com.synechron.bug.Beedrill;

public class Main{

	public static void main(String...args){

		int growthRate= 10;
		int evolutionThreshold =10;
    	Beedrill beedrill = new Beedrill(growthRate, evolutionThreshold);
		beedrill.absorbHealth();


		
	}
	
}