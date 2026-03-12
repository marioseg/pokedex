package com.synechron.poison;

public class Nidoran{
	
	private String weaknesses;
	private String resistances;
	
	public Nidoran(String weaknesses, String resistances ){
		System.out.println("Calling the constructor of Nidoran");
		this.weaknesses = weaknesses;
		this.resistances = resistances;
		
	}
	
	public String getWeaknesses(String weaknesses){
		System.out.println("The baseStats for Nidoran is "+weaknesses);
		return weaknesses;
		
	}
	
	public void setWeaknesses(String weaknesses){
	     this. weaknesses = weaknesses;
	} 
	
	public String getResistances(String resistances){
		System.out.println("The immunities for Nidoran is "+resistances);
		return resistances;
	}
	
	public void setResistances(String resistances){
		this.resistances= resistances;
		
	}
	
	public int toxic(int target){
		System.out.println("Calling the toxic for Nidoran");
		return target;
	}
	
	public void sludgeBomb(int target){
		System.out.println("Calling the sludgeBomb for Nidoran"+target);
	}
	
	
}