package com.synechron.ice;

public class Jynx{
	
	private String weaknesses;
	private String immunities;
	
	public Jynx(String weaknesses, String immunities ){
		System.out.println("Calling the constructor of Jynx");
		this.weaknesses = weaknesses;
		this.immunities = immunities;
		
	}
	
	public String getWeaknesses(String weaknesses){
		System.out.println("The weaknesses for Jynx is "+weaknesses);
		return weaknesses;
		
	}
	
	public void setWeaknesses(String weaknesses){
	     this. weaknesses = weaknesses;
	} 
	
	public String getImmunities(String immunities){
		System.out.println("The immunities for Jynx is "+immunities);
		return immunities;
	}
	
	public void setImmunities(String immunities){
		this.immunities= immunities;
		
	}
	
	
	public int iceBeam(int target){
		System.out.println("Calling the iceBeam for Jynx");
		return target;
	}
	
	public void haze(){
		System.out.println("Calling the haze for Jynx");
	}
	
}