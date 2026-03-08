package com.synechron.normal;

public class Kangaskhan{
	
	private String baseStats;
	private String immunities;
	
	public Kangaskhan(String baseStats, String immunities ){
		System.out.println("Calling the constructor of Kangaskhan");
		this.baseStats = baseStats;
		this.immunities = immunities;
		
	}
	
	public String getBaseStats(String baseStats){
		System.out.println("The baseStats for Kangaskhan is "+baseStats);
		return baseStats;
		
	}
	
	public void setBaseStats(String baseStats){
	     this. baseStats = baseStats;
	} 
	
	public String getImmunities(String immunities){
		System.out.println("The immunities for Kangaskhan is "+immunities);
		return immunities;
	}
	
	public void setImmunities(String immunities){
		this.immunities= immunities;
		
	}
	
	public int quickAttack(int target){
		System.out.println("Calling the iceBeam for Kangaskhan");
		return target;
	}
	
	public void recover(){
		System.out.println("Calling the recover for Kangaskhan");
	}
	
	
}