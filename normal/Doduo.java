package com.synechron.normal;

public class Doduo{
	
	private String baseStats;
	private String immunities;
	
	public Doduo(String baseStats, String immunities ){
		System.out.println("Calling the constructor of Doduo");
		this.baseStats = baseStats;
		this.immunities = immunities;
		
	}
	
	public String getBaseStats(String baseStats){
		System.out.println("The baseStats for Doduo is "+baseStats);
		return baseStats;
		
	}
	
	public void setBaseStats(String baseStats){
	     this. baseStats = baseStats;
	} 
	
	public String getImmunities(String immunities){
		System.out.println("The immunities for Doduo is "+immunities);
		return immunities;
	}
	
	public void setImmunities(String immunities){
		this.immunities= immunities;
		
	}
	
	public int quickAttack(int target){
		System.out.println("Calling the iceBeam for Doduo");
		return target;
	}
	
	public void recover(){
		System.out.println("Calling the recover for Doduo");
	}
	
	
}