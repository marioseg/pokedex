package com.synechron.bug;

public class Scyther{
	
	private int growthRate;
	private int evolutionThreshold;
	
	
	public Scyther(int growthRate, int evolutionThreshold){
		System.out.println("Calling the constructor of Scyther");
		this.growthRate = growthRate;
		this.evolutionThreshold = evolutionThreshold;
		
	}
	
	public int getGrowthRate(int growthRate){
		System.out.println("The growthRate for Scyther is "+growthRate);
		return growthRate;
		
	}
	
	public void setGrowthRate(int growthRate){
		 this. growthRate = growthRate;
	} 
	
	public int getEvolutionThreshold(int evolutionThreshold){
		System.out.println("The evolutionThreshold for Scyther is "+evolutionThreshold);
		return evolutionThreshold;
		
	}
	
	public void setEvolutionThreshold(int evolutionThreshold){
		 this. evolutionThreshold = evolutionThreshold;
	}
	
	public void lowerEnemyStatus(){
		System.out.println("Calling the lowerEnemyStatus of Scyther");
	}
	
	public void absorbHealth(){
		System.out.println("Calling the absorbHealth of Scyther");
	}
	
}