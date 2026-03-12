package com.synechron.poison;

public class Mime{
	
	private String weaknesses;
	private String resistances;
	
	public Mime(String weaknesses, String resistances ){
		System.out.println("Calling the constructor of Mime");
		this.weaknesses = weaknesses;
		this.resistances = resistances;
		
	}
	
	public String getWeaknesses(String weaknesses){
		System.out.println("The baseStats for Mime is "+weaknesses);
		return weaknesses;
		
	}
	
	public void setWeaknesses(String weaknesses){
	     this. weaknesses = weaknesses;
	} 
	
	public String getResistances(String resistances){
		System.out.println("The immunities for Mime is "+resistances);
		return resistances;
	}
	
	public void setResistances(String resistances){
		this.resistances= resistances;
		
	}
	
	public int psychicAttack(int target){
		System.out.println("Calling the psychicAttack for Mime");
		return target;
	}
	
	public void hypnosis(int target){
		System.out.println("Calling the hypnosis for Mime");
	}
	
	
}