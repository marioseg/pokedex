package com.synechron.electric;

public class Electabuzz{
	
	private String weakness;
	private String resistance;
	
	
	public Electabuzz(String weakness, String resistance ){
		System.out.println("Calling the constructor of Electabuzz");
		this.weakness = weakness;
		this.resistance = resistance;
		
	}
	
	public String getWeakness(String weakness){
		System.out.println("The weakness for Electabuzz is "+weakness);
		return weakness;
		
	}
	
	public void setGrowthRate(String weakness){
	     this. weakness = weakness;
	} 
	
	public String getResistance(String resistance){
		System.out.println("The resistance for Electabuzz is "+resistance);
		return resistance;
		
	}
	
	public void setResistance(String resistance){
		 this. resistance = resistance;
	}
	
	public int thunderWave(int target){
		System.out.println("Calling thunderWave of Electabuzz");
		return target;
	}
	
	public int thunder(int target){
		System.out.println("Calling thunder of Electabuzz");
		return target;
	}
	
	
}