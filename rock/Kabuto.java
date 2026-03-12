package com.synechron.rock;

public class Kabuto{
	
	private String weaknesses;
	private String resistances;
	
	public Kabuto(String weaknesses, String resistances ){
		System.out.println("Calling the constructor of Kabuto");
		this.weaknesses = weaknesses;
		this.resistances = resistances;
		
	}
	
	public String getWeaknesses(String weaknesses){
		System.out.println("The baseStats for Kabuto is "+weaknesses);
		return weaknesses;
		
	}
	
	public void setWeaknesses(String weaknesses){
	     this. weaknesses = weaknesses;
	} 
	
	public String getResistances(String resistances){
		System.out.println("The immunities for Kabuto is "+resistances);
		return resistances;
	}
	
	public void setResistances(String resistances){
		this.resistances= resistances;
		
	}
	
	public int stoneEdge(int target){
		System.out.println("Calling the stoneEdge for Kabuto");
		return target;
	}
	
	public void sandstorm(String currentBattlefield){
		System.out.println("Calling the sandstorm for Kabuto"+currentBattlefield);
	}
	
	
}