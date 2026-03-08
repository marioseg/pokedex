package com.synechron.rock;

public class Geodude{
	
	private String weaknesses;
	private String resistances;
	
	public Geodude(String weaknesses, String resistances ){
		System.out.println("Calling the constructor of Geodude");
		this.weaknesses = weaknesses;
		this.resistances = resistances;
		
	}
	
	public String getWeaknesses(String weaknesses){
		System.out.println("The baseStats for Geodude is "+weaknesses);
		return weaknesses;
		
	}
	
	public void setWeaknesses(String weaknesses){
	     this. weaknesses = weaknesses;
	} 
	
	public String getResistances(String resistances){
		System.out.println("The immunities for Geodude is "+resistances);
		return resistances;
	}
	
	public void setResistances(String resistances){
		this.resistances= resistances;
		
	}
	
	public int stoneEdge(int target){
		System.out.println("Calling the stoneEdge for Geodude");
		return target;
	}
	
	public void sandstorm(String currentBattlefield){
		System.out.println("Calling the sandstorm for Geodude"+currentBattlefield);
	}
	
	
}