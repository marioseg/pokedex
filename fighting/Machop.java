package com.synechron.fighting;

public class Machop{
	
	private String physicalAttack;
	private String resistance;
	
	public Machop(String physicalAttack, String resistance ){
		System.out.println("Calling the constructor of Machop");
		this.physicalAttack = physicalAttack;
		this.resistance = resistance;
		
	}
	
	public String getPhysicalAttack(String physicalAttack){
		System.out.println("The physicalAttack for Machop is "+physicalAttack);
		return physicalAttack;
		
	}
	
	public void setPhysicalAttack(String physicalAttack){
	     this. physicalAttack = physicalAttack;
	} 
	
	public String getResistance(String resistance){
		System.out.println("The resistance for Machop is "+resistance);
		return resistance;
		
	}
	
	public void setResistance(String resistance){
		 this. resistance = resistance;
	}
	
	public int submission(int target){
		System.out.println("Calling submission of Machop");
		return target;
	}
	
	public int seismicToss(int target){
		System.out.println("Calling seismicToss of Machop");
		return target;
	}
	
	
	
	
}