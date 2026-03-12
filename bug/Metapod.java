package com.synechron.bug;

public class Metapod{
	
	private int growthRate;
	private int evolutionThreshold;
	
	
	public Metapod(int growthRate, int evolutionThreshold){
		System.out.println("Calling the constructor of Metapod");
		this.growthRate = growthRate;
		this.evolutionThreshold = evolutionThreshold;
		
	}
	
	public int getGrowthRate(int growthRate){
		System.out.println("The growthRate for Metapod is "+growthRate);
		return growthRate;
		
	}
	
	public void setGrowthRate(int growthRate){
		 this. growthRate = growthRate;
	} 
	
	public int getEvolutionThreshold(int evolutionThreshold ){
		System.out.println("The evolutionThreshold for Metapod is "+evolutionThreshold);
		return evolutionThreshold;
		
	}
	
	public void setEvolutionThreshold(int evolutionThreshold){
		 this. evolutionThreshold = evolutionThreshold;
	}
	
	public void lowerEnemyStatus(){
		System.out.println("Calling the lowerEnemyStatus of Metapod");
	}
	
	public void absorbHealth(){
		System.out.println("Calling the absorbHealth of Metapod");
	}
	
}