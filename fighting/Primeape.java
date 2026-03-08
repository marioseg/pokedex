package com.synechron.fighting;

public class Primeape{
	
	private String physicalAttack;
	private String resistance;
	
	public Primeape(String physicalAttack, String resistance ){
		System.out.println("Calling the constructor of Primeape");
		this.physicalAttack = physicalAttack;
		this.resistance = resistance;
		
	}
	
	public String getPhysicalAttack(String physicalAttack){
		System.out.println("The physicalAttack for Primeape is "+physicalAttack);
		return physicalAttack;
		
	}
	
	public void setPhysicalAttack(String physicalAttack){
	     this. physicalAttack = physicalAttack;
	} 
	
	public String getResistance(String resistance){
		System.out.println("The resistance for Primeape is "+resistance);
		return resistance;
		
	}
	
	public void setResistance(String resistance){
		 this. resistance = resistance;
	}
	
	public int submission(int target){
		System.out.println("Calling submission of Primeape");
		return target;
	}
	
	public int seismicToss(int target){
		System.out.println("Calling seismicToss of Primeape");
		return target;
	}
	
	
	
	
}