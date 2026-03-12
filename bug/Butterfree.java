package com.synechron.bug;

public class Butterfree{
	
	private int growthRate;
	private int evolutionThreshold;
	
	
	public Butterfree(int growthRate, int evolutionThreshold){
		this.growthRate = growthRate;
		this.evolutionThreshold = evolutionThreshold;
		
	}
	
	public int getGrowthRate(int growthRate){
		return growthRate;
		
	}
	
	public void setGrowthRate(int growthRate){
		 this. growthRate = growthRate;
	} 
	
	public int getEvolutionThreshold(int evolutionThreshold){
		return evolutionThreshold;
		
	}
	
	public void setEvolutionThreshold(int evolutionThreshold){
		 this. evolutionThreshold = evolutionThreshold;
	}
	
	public void lowerEnemyStatus(){
		System.out.println("Calling the lowerEnemyStatus of Butterfree");
	}
	
	public void absorbHealth(){
		System.out.println("Calling the absorbHealth of Butterfree");
	}
	
}