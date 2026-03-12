package com.synechron.grass;

public class Tangela{
	
	private String weaknesses;
	private String immunities;
	
	public Tangela(String weaknesses, String immunities ){
		System.out.println("Calling the constructor of Tangela");
		this.weaknesses = weaknesses;
		this.immunities = immunities;
		
	}
	
	public String getWeaknesses(String weaknesses){
		System.out.println("The weaknesses for Tangela is "+weaknesses);
		return weaknesses;
		
	}
	
	public void setWeaknesses(String weaknesses){
	     this. weaknesses = weaknesses;
	} 
	
	public String getImmunities(String immunities){
		System.out.println("The immunities for Tangela is "+immunities);
		return immunities;
	}
	
	public void setImmunities(String immunities){
		this.immunities= immunities;
		
	}
	
	
	public int leechSeed(int target){
		System.out.println("Calling the leechSeed for Tangela");
		return target;
	}
	
	public void megaDrain(){
		System.out.println("Calling the megaDrain for Tangela");
	}
	
}