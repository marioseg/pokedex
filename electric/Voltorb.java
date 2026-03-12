package com.synechron.electric;

public class Voltorb{
	
	private String weakness;
	private String resistance;
	
	
	public Voltorb(String weakness, String resistance ){
		System.out.println("Calling the constructor of Voltorb");
		this.weakness = weakness;
		this.resistance = resistance;
		
	}
	
	public String getWeakness(String weakness){
		System.out.println("The weakness for Voltorb is "+weakness);
		return weakness;
		
	}
	
	public void setGrowthRate(String weakness){
	     this. weakness = weakness;
	} 
	
	public String getResistance(String resistance){
		System.out.println("The resistance for Voltorb is "+resistance);
		return resistance;
		
	}
	
	public void setResistance(String resistance){
		 this. resistance = resistance;
	}
	
	public int thunderWave(int target){
		System.out.println("Calling thunderWave of Voltorb");
		return target;
	}
	
	public int thunder(int target){
		System.out.println("Calling thunder of Voltorb");
		return target;
	}
	
	
}