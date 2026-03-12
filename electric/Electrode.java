package com.synechron.electric;

public class Electrode{
	
	private String weakness;
	private String resistance;
	
	
	public Electrode(String weakness, String resistance ){
		System.out.println("Calling the constructor of Electrode");
		this.weakness = weakness;
		this.resistance = resistance;
		
	}
	
	public String getWeakness(String weakness){
		System.out.println("The weakness for Electrode is "+weakness);
		return weakness;
		
	}
	
	public void setGrowthRate(String weakness){
	     this. weakness = weakness;
	} 
	
	public String getResistance(String resistance){
		System.out.println("The resistance for Electrode is "+resistance);
		return resistance;
		
	}
	
	public void setResistance(String resistance){
		 this. resistance = resistance;
	}
	
	public int thunderWave(int target){
		System.out.println("Calling thunderWave of Electrode");
		return target;
	}
	
	public int thunder(int target){
		System.out.println("Calling thunder of Electrode");
		return target;
	}
	
	
}