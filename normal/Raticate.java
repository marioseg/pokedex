package com.synechron.normal;

public class Raticate{
	
	private String baseStats;
	private String immunities;
	
	public Raticate(String baseStats, String immunities ){
		System.out.println("Calling the constructor of Raticate");
		this.baseStats = baseStats;
		this.immunities = immunities;
		
	}
	
	public String getBaseStats(String baseStats){
		System.out.println("The baseStats for Raticate is "+baseStats);
		return baseStats;
		
	}
	
	public void setBaseStats(String baseStats){
	     this. baseStats = baseStats;
	} 
	
	public String getImmunities(String immunities){
		System.out.println("The immunities for Raticate is "+immunities);
		return immunities;
	}
	
	public void setImmunities(String immunities){
		this.immunities= immunities;
		
	}
	
	public int quickAttack(int target){
		System.out.println("Calling the iceBeam for Raticate");
		return target;
	}
	
	public void recover(){
		System.out.println("Calling the recover for Raticate");
	}
	
	
}