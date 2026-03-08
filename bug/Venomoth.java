package com.synechron.bug;

public class Venomoth{
	
	private int growthRate;
	private int evolutionThreshold;
	
	
	public Venomoth(int growthRate, int evolutionThreshold){
		System.out.println("Calling the constructor of Venomoth");
		this.growthRate = growthRate;
		this.evolutionThreshold = evolutionThreshold;
		
	}
	
	public int getGrowthRate(int growthRate){
		System.out.println("The growthRate for Venomoth is "+growthRate);
		return growthRate;
		
	}
	
	public void setGrowthRate(int growthRate){
		 this. growthRate = growthRate;
	} 
	
	public int getEvolutionThreshold(int evolutionThreshold){
		System.out.println("The evolutionThreshold for Venomoth is "+evolutionThreshold);
		return evolutionThreshold;
		
	}
	
	public void setEvolutionThreshold(int evolutionThreshold){
		 this. evolutionThreshold = evolutionThreshold;
	}
	
	public void lowerEnemyStatus(){
		System.out.println("Calling the lowerEnemyStatus of Venomoth");
	}
	
	public void absorbHealth(){
		System.out.println("Calling the absorbHealth of Venomoth");
	}
	
}