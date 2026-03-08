package com.synechron.dragon;

public class Dragonite{
	
	private String weakness;
	private String resistance;
	
	
	public Dragonite(String weakness, String resistance ){
		System.out.println("Calling the constructor of Dragonite");
		this.weakness = weakness;
		this.resistance = resistance;
		
	}
	
	public String getWeakness(String weakness){
		System.out.println("The weakness for Dragonite is "+weakness);
		return weakness;
		
	}
	
	public void setGrowthRate(String weakness){
	     this. weakness = weakness;
	} 
	
	public String getResistance(String resistance){
		System.out.println("The resistance for Dragonite is "+resistance);
		return resistance;
		
	}
	
	public void setResistance(String resistance){
		 this. resistance = resistance;
	}
	
	public int dragonRange(int range){
		System.out.println("Calling the dragonRange method of Dragonite");
		return range;
		
	}
	
	public int outRage(int target){
		System.out.println("Calling the outRage method of Dragonite");
		return target;
	}
	
}