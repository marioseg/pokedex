package com.synechron.normal;

public class Chansey{
	
	private String baseStats;
	private String immunities;
	
	public Chansey(String baseStats, String immunities ){
		System.out.println("Calling the constructor of Chansey");
		this.baseStats = baseStats;
		this.immunities = immunities;
		
	}
	
	public String getBaseStats(String baseStats){
		System.out.println("The baseStats for Chansey is "+baseStats);
		return baseStats;
		
	}
	
	public void setBaseStats(String baseStats){
	     this. baseStats = baseStats;
	} 
	
	public String getImmunities(String immunities){
		System.out.println("The immunities for Chansey is "+immunities);
		return immunities;
	}
	
	public void setImmunities(String immunities){
		this.immunities= immunities;
		
	}
	
	public int quickAttack(int target){
		System.out.println("Calling the iceBeam for Chansey");
		return target;
	}
	
	public void recover(){
		System.out.println("Calling the recover for Chansey");
	}
	
	
}