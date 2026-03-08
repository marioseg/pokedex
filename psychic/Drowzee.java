package com.synechron.poison;

public class Drowzee{
	
	private String weaknesses;
	private String resistances;
	
	public Drowzee(String weaknesses, String resistances ){
		System.out.println("Calling the constructor of Drowzee");
		this.weaknesses = weaknesses;
		this.resistances = resistances;
		
	}
	
	public String getWeaknesses(String weaknesses){
		System.out.println("The baseStats for Drowzee is "+weaknesses);
		return weaknesses;
		
	}
	
	public void setWeaknesses(String weaknesses){
	     this. weaknesses = weaknesses;
	} 
	
	public String getResistances(String resistances){
		System.out.println("The immunities for Drowzee is "+resistances);
		return resistances;
	}
	
	public void setResistances(String resistances){
		this.resistances= resistances;
		
	}
	
	public int psychicAttack(int target){
		System.out.println("Calling the psychicAttack for Drowzee");
		return target;
	}
	
	public void hypnosis(int target){
		System.out.println("Calling the hypnosis for Drowzee");
	}
	
	
}