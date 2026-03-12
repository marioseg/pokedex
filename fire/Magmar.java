package com.synechron.fire;

public class Magmar{
	
	private String specialAttackPower;
	private String immunities;
	
	public Magmar(String specialAttackPower, String immunities ){
		System.out.println("Calling the constructor of Magmar");
		this.specialAttackPower = specialAttackPower;
		this.immunities = immunities;
		
	}
	
	public String getspecialAttackPower(String specialAttackPower){
		System.out.println("The specialAttackPower for Magmar is "+specialAttackPower);
		return specialAttackPower;
		
	}
	
	public void setspecialAttackPower(String specialAttackPower){
	     this. specialAttackPower = specialAttackPower;
	} 
	
	public String getImmunities(String immunities){
		System.out.println("The immunities for Magmar is "+immunities);
		return immunities;
	}
	
		
	public void setImmunities(String immunities){
		this.immunities= immunities;
	}
	
	
	public int flameThrower(int target){
		System.out.println("Calling the flameThrower for Magmar");
		return target;
	}
	
	public void sunnyDay(){
		System.out.println("Calling the sunnyDay for Magmar");
	}
	
}