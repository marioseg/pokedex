package com.synechron.grass;

public class Exeggutor{
	
	private String weaknesses;
	private String immunities;
	
	public Exeggutor(String weaknesses, String immunities ){
		System.out.println("Calling the constructor of Exeggutor");
		this.weaknesses = weaknesses;
		this.immunities = immunities;
		
	}
	
	public String getWeaknesses(String weaknesses){
		System.out.println("The weaknesses for Exeggutor is "+weaknesses);
		return weaknesses;
		
	}
	
	public void setWeaknesses(String weaknesses){
	     this. weaknesses = weaknesses;
	} 
	
	public String getImmunities(String immunities){
		System.out.println("The immunities for Exeggutor is "+immunities);
		return immunities;
	}
	
	public void setImmunities(String immunities){
		this.immunities= immunities;
		
	}
	
	
	public int leechSeed(int target){
		System.out.println("Calling the leechSeed for Exeggutor");
		return target;
	}
	
	public void megaDrain(){
		System.out.println("Calling the megaDrain for Exeggutor");
	}
	
}