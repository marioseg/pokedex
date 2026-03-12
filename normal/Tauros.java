package com.synechron.normal;

public class Tauros{
	
	private String baseStats;
	private String immunities;
	
	public Tauros(String baseStats, String immunities ){
		System.out.println("Calling the constructor of Tauros");
		this.baseStats = baseStats;
		this.immunities = immunities;
		
	}
	
	public String getBaseStats(String baseStats){
		System.out.println("The baseStats for Tauros is "+baseStats);
		return baseStats;
		
	}
	
	public void setBaseStats(String baseStats){
	     this. baseStats = baseStats;
	} 
	
	public String getImmunities(String immunities){
		System.out.println("The immunities for Tauros is "+immunities);
		return immunities;
	}
	
	public void setImmunities(String immunities){
		this.immunities= immunities;
		
	}
	
	public int quickAttack(int target){
		System.out.println("Calling the iceBeam for Tauros");
		return target;
	}
	
	public void recover(){
		System.out.println("Calling the recover for Tauros");
	}
	
	
}