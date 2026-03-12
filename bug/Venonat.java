package com.synechron.bug;

public class Venonat{
	
	private int growthRate;
	private int evolutionThreshold;
	
	
	public Venonat(int growthRate, int evolutionThreshold){
		System.out.println("Calling the constructor of Venonat");
		this.growthRate = growthRate;
		this.evolutionThreshold = evolutionThreshold;
		
	}
	
	public int getGrowthRate(int growthRate){
		System.out.println("The growthRate for Venonat is "+growthRate);
		return growthRate;
		
	}
	
	public void setGrowthRate(int growthRate){
		 this. growthRate = growthRate;
	} 
	
	public int getEvolutionThreshold(int evolutionThreshold){
		System.out.println("The evolutionThreshold for Venonat is "+evolutionThreshold);
		return evolutionThreshold;
		
	}
	
	public void setEvolutionThreshold(int evolutionThreshold){
		 this. evolutionThreshold = evolutionThreshold;
	}
	
	public void lowerEnemyStatus(){
		System.out.println("Calling the lowerEnemyStatus of Venonat");
	}
	
	public void absorbHealth(){
		System.out.println("Calling the absorbHealth of Venonat");
	}
	
}