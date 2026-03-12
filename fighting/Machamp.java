package com.synechron.fighting;

public class Machamp{
	
	private String physicalAttack;
	private String resistance;
	
	public Machamp(String physicalAttack, String resistance ){
		System.out.println("Calling the constructor of Machamp");
		this.physicalAttack = physicalAttack;
		this.resistance = resistance;
		
	}
	
	public String getPhysicalAttack(String physicalAttack){
		System.out.println("The physicalAttack for Machamp is "+physicalAttack);
		return physicalAttack;
		
	}
	
	public void setPhysicalAttack(String physicalAttack){
	     this. physicalAttack = physicalAttack;
	} 
	
	public String getResistance(String resistance){
		System.out.println("The resistance for Machamp is "+resistance);
		return resistance;
		
	}
	
	public void setResistance(String resistance){
		 this. resistance = resistance;
	}
	
	public int submission(int target){
		System.out.println("Calling submission of Machamp");
		return target;
	}
	
	public int seismicToss(int target){
		System.out.println("Calling seismicToss of Machamp");
		return target;
	}
	
	
	
	
}