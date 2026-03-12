package com.synechron.normal;

public class Snorlax{
	
	private String baseStats;
	private String immunities;
	
	public Snorlax(String baseStats, String immunities ){
		System.out.println("Calling the constructor of Snorlax");
		this.baseStats = baseStats;
		this.immunities = immunities;
		
	}
	
	public String getBaseStats(String baseStats){
		System.out.println("The baseStats for Snorlax is "+baseStats);
		return baseStats;
		
	}
	
	public void setBaseStats(String baseStats){
	     this. baseStats = baseStats;
	} 
	
	public String getImmunities(String immunities){
		System.out.println("The immunities for Snorlax is "+immunities);
		return immunities;
	}
	
	public void setImmunities(String immunities){
		this.immunities= immunities;
		
	}
	
	public int quickAttack(int target){
		System.out.println("Calling the iceBeam for Snorlax");
		return target;
	}
	
	public void recover(){
		System.out.println("Calling the recover for Snorlax");
	}
	
	
}