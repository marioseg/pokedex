package com.synechron.grass;

public class Weepinbell{
	
	private String weaknesses;
	private String immunities;
	
	public Weepinbell(String weaknesses, String immunities ){
		System.out.println("Calling the constructor of Weepinbell");
		this.weaknesses = weaknesses;
		this.immunities = immunities;
		
	}
	
	public String getWeaknesse(String weaknesses){
		System.out.println("The weaknesses for Weepinbell is "+weaknesses);
		return weaknesses;
		
	}
	
	public void setWeaknesses(String weaknesses){
	     this. weaknesses = weaknesses;
	} 
	
	public String getImmunities(String immunities){
		System.out.println("The immunities for Weepinbell is "+immunities);
		return immunities;
	}
	
	public void setImmunities(String immunities){
		this.immunities= immunities;
		
	}
	
	
	public int leechSeed(int target){
		System.out.println("Calling the leechSeed for Weepinbell");
		return target;
	}
	
	public void megaDrain(){
		System.out.println("Calling the megaDrain for Weepinbell");
	}
	
}