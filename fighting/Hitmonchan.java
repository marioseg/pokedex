package com.synechron.fighting;

public class Hitmonchan{
	
	private String physicalAttack;
	private String resistance;
	
	public Hitmonchan(String physicalAttack, String resistance ){
		System.out.println("Calling the constructor of Hitmonchan");
		this.physicalAttack = physicalAttack;
		this.resistance = resistance;
		
	}
	
	public String getPhysicalAttack(String physicalAttack){
		System.out.println("The physicalAttack for Hitmonchan is "+physicalAttack);
		return physicalAttack;
		
	}
	
	public void setPhysicalAttack(String physicalAttack){
	     this. physicalAttack = physicalAttack;
	} 
	
	public String getResistance(String resistance){
		System.out.println("The resistance for Hitmonchan is "+resistance);
		return resistance;
		
	}
	
	public void setResistance(String resistance){
		 this. resistance = resistance;
	}
	
	public int submission(int target){
		System.out.println("Calling submission of Hitmonchan");
		return target;
	}
	
	public int seismicToss(int target){
		System.out.println("Calling seismicToss of Hitmonchan");
		return target;
	}
	
	
	
	
}