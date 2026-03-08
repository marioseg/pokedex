package com.synechron.electric;

public class Magnemite{
	
	private String weakness;
	private String resistance;
	
	
	public Magnemite(String weakness, String resistance ){
		System.out.println("Calling the constructor of Magnemite");
		this.weakness = weakness;
		this.resistance = resistance;
		
	}
	
	public String getWeakness(String weakness){
		System.out.println("The weakness for Magnemite is "+weakness);
		return weakness;
		
	}
	
	public void setGrowthRate(String weakness){
	     this. weakness = weakness;
	} 
	
	public String getResistance(String resistance){
		System.out.println("The resistance for Magnemite is "+resistance);
		return resistance;
		
	}
	
	public void setResistance(String resistance){
		 this. resistance = resistance;
	}
	
	public int thunderWave(int target){
		System.out.println("Calling thunderWave of Magnemite");
		return target;
	}
	
	public int thunder(int target){
		System.out.println("Calling thunder of Magnemite");
		return target;
	}
	
	
}