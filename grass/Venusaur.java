package com.synechron.grass;

public class Venusaur{
	
	private String weaknesses;
	private String immunities;
	
	public Venusaur(String weaknesses, String immunities ){
		System.out.println("Calling the constructor of Venusaur");
		this.weaknesses = weaknesses;
		this.immunities = immunities;
		
	}
	
	public String getWeaknesses(String weaknesses){
		System.out.println("The weaknesses for Venusaur is "+weaknesses);
		return weaknesses;
		
	}
	
	public void setWeaknesses(String weaknesses){
	     this. weaknesses = weaknesses;
	} 
	
	public String getImmunities(String immunities){
		System.out.println("The immunities for Venusaur is "+immunities);
		return immunities;
	}
	
	public void setImmunities(String immunities){
		this.immunities= immunities;
		
	}
	
	
	public int leechSeed(int target){
		System.out.println("Calling the leechSeed for Venusaur");
		return target;
	}
	
	public void megaDrain(){
		System.out.println("Calling the megaDrain for Venusaur");
	}
	
}