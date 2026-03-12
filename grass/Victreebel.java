package com.synechron.grass;

public class Victreebel{
	
	private String weaknesses;
	private String immunities;
	
	public Victreebel(String weaknesses, String immunities ){
		System.out.println("Calling the constructor of Victreebel");
		this.weaknesses = weaknesses;
		this.immunities = immunities;
		
	}
	
	public String getWeaknesses(String weaknesses){
		System.out.println("The weaknesses for Victreebel is "+weaknesses);
		return weaknesses;
		
	}
	
	public void setWeaknesses(String weaknesses){
	     this. weaknesses = weaknesses;
	} 
	
	public String getImmunities(String immunities){
		System.out.println("The immunities for Victreebel is "+immunities);
		return immunities;
	}
	
	public void setImmunities(String immunities){
		this.immunities= immunities;
		
	}
	
	
	public int leechSeed(int target){
		System.out.println("Calling the leechSeed for Victreebel");
		return target;
	}
	
	public void megaDrain(){
		System.out.println("Calling the megaDrain for Victreebel");
	}
	
}