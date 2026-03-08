package com.synechron.fire;

public class Charmander{
	
	private String specialAttackPower;
	private String immunities;
	
	public Charmander(String specialAttackPower, String immunities ){
		System.out.println("Calling the constructor of Charmander");
		this.specialAttackPower = specialAttackPower;
		this.immunities = immunities;
		
	}
	
	public String getspecialAttackPower(String specialAttackPower){
		System.out.println("The specialAttackPower for Charmander is "+specialAttackPower);
		return specialAttackPower;
		
	}
	
	public void setspecialAttackPower(String specialAttackPower){
	     this. specialAttackPower = specialAttackPower;
	} 
	
	public String getImmunities(String immunities){
		System.out.println("The immunities for Charmander is "+immunities);
		return immunities;
	}
	
		
	public void setImmunities(String immunities){
		this.immunities= immunities;
	}
	
	
	
	
	public int flameThrower(int target){
		System.out.println("Calling the flameThrower for Charmander");
		return target;
	}
	
	public void sunnyDay(){
		System.out.println("Calling the sunnyDay for Charmander");
	}
	
}