package com.synechron.rock;

public class Graveler{
	
	private String weaknesses;
	private String resistances;
	
	public Graveler(String weaknesses, String resistances ){
		System.out.println("Calling the constructor of Graveler");
		this.weaknesses = weaknesses;
		this.resistances = resistances;
		
	}
	
	public String getWeaknesses(String weaknesses){
		System.out.println("The baseStats for Graveler is "+weaknesses);
		return weaknesses;
		
	}
	
	public void setWeaknesses(String weaknesses){
	     this. weaknesses = weaknesses;
	} 
	
	public String getResistances(String resistances){
		System.out.println("The immunities for Graveler is "+resistances);
		return resistances;
	}
	
	public void setResistances(String resistances){
		this.resistances= resistances;
		
	}
	
	public int stoneEdge(int target){
		System.out.println("Calling the stoneEdge for Graveler");
		return target;
	}
	
	public void sandstorm(String currentBattlefield){
		System.out.println("Calling the sandstorm for Graveler"+currentBattlefield);
	}
	
	
}