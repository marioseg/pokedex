package com.synechron.fire;

public class Moltres{
	
	private String specialAttackPower;
	private String immunities;
	
	public Moltres(String specialAttackPower, String immunities ){
		System.out.println("Calling the constructor of Moltres");
		this.specialAttackPower = specialAttackPower;
		this.immunities = immunities;
		
	}
	
	public String getspecialAttackPower(String specialAttackPower){
		System.out.println("The specialAttackPower for Moltres is "+specialAttackPower);
		return specialAttackPower;
		
	}
	
	public void setspecialAttackPower(String specialAttackPower){
	     this. specialAttackPower = specialAttackPower;
	} 
	
	public String getImmunities(String immunities){
		System.out.println("The immunities for Moltres is "+immunities);
		return immunities;
	}
	
		
	public void setImmunities(String immunities){
		this.immunities= immunities;
	}
	
	
	public int flameThrower(int target){
		System.out.println("Calling the flameThrower for Moltres");
		return target;
	}
	
	public void sunnyDay(){
		System.out.println("Calling the sunnyDay for Moltres");
	}
	
}