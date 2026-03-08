package com.synechron.bug;

public class Beedrill{
	
	private int growthRate;
	private int evolutionThreshold;
	
	
	public Beedrill(int growthRate, int evolutionThreshold){
		System.out.println("Calling the constructor of Beedrill");
		this.growthRate = growthRate;
		this.evolutionThreshold = evolutionThreshold;
		
	}
	
	public int getGrowthRate(int growthRate){
		System.out.println("The growthRate for Beedrill is "+growthRate);
		return growthRate;
		
	}
	
	public void setGrowthRate(int growthRate){
	     this. growthRate = growthRate;
	} 
	
	public int getEvolutionThreshold(int evolutionThreshold){
		 System.out.println("The evolutionThreshold for Beedrill is "+evolutionThreshold);
		return evolutionThreshold;
		
	}
	
	public void setEvolutionThreshold(int evolutionThreshold){
		 this. evolutionThreshold = evolutionThreshold;
	}
	
	public void lowerEnemyStatus(){
		System.out.println("Calling the lowerEnemyStatus of Beedrill");
	}
	
	public void absorbHealth(){
		System.out.println("Calling the absorbHealth of Beedrill");
	}
	
}