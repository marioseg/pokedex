package com.synechron.water;

public class Poliwrath{
	
	private String weaknesses;
	private String resistances;
	
	public Poliwrath(String weaknesses, String resistances ){
		System.out.println("Calling the constructor of Poliwrath");
		this.weaknesses = weaknesses;
		this.resistances = resistances;
		
	}
	
	public String getWeaknesses(String weaknesses){
		System.out.println("The baseStats for Poliwrath is "+weaknesses);
		return weaknesses;
		
	}
	
	public void setWeaknesses(String weaknesses){
	     this. weaknesses = weaknesses;
	} 
	
	public String getResistances(String resistances){
		System.out.println("The immunities for Poliwrath is "+resistances);
		return resistances;
	}
	
	public void setResistances(String resistances){
		this.resistances= resistances;
		
	}
	
	public int surf(int target){
		System.out.println("Calling the surf for Poliwrath");
		return target;
	}
	
	public void hydroPump(String currentBattlefield){
		System.out.println("Calling the hydroPump for Poliwrath"+currentBattlefield);
	}
	
	
}