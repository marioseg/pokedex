package com.synechron.grass;

public class Exeggcute{
	
	private String weaknesses;
	private String immunities;
	
	public Exeggcute(String weaknesses, String immunities ){
		System.out.println("Calling the constructor of Exeggcute");
		this.weaknesses = weaknesses;
		this.immunities = immunities;
		
	}
	
	public String getWeaknesses(String weaknesses){
		System.out.println("The weaknesses for Exeggcute is "+weaknesses);
		return weaknesses;
		
	}
	
	public void setWeaknesses(String weaknesses){
	     this. weaknesses = weaknesses;
	} 
	
	public String getImmunities(String immunities){
		System.out.println("The immunities for Exeggcute is "+immunities);
		return immunities;
	}
	
	public void setImmunities(String immunities){
		this.immunities= immunities;
		
	}
	
	
	public int leechSeed(int target){
		System.out.println("Calling the leechSeed for Exeggcute");
		return target;
	}
	
	public void megaDrain(int target){
		System.out.println("Calling the megaDrain for Exeggcute");
	}
	
}