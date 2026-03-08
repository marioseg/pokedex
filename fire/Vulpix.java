package com.synechron.fire;

public class Vulpix{
	
	private String specialAttackPower;
	private String immunities;
	
	public Vulpix(String specialAttackPower, String immunities ){
		System.out.println("Calling the constructor of Vulpix");
		this.specialAttackPower = specialAttackPower;
		this.immunities = immunities;
		
	}
	
	public String getspecialAttackPower(String specialAttackPower){
		System.out.println("The specialAttackPower for Vulpix is "+specialAttackPower);
		return specialAttackPower;
		
	}
	
	public void setspecialAttackPower(String specialAttackPower){
	     this. specialAttackPower = specialAttackPower;
	} 
	
    public String getImmunities(String immunities){
		System.out.println("The immunities for Vulpix is "+immunities);
		return immunities;
	}
	
		
	public void setImmunities(String immunities){
		this.immunities= immunities;
	}
	
	
	public int flameThrower(int target){
		System.out.println("Calling the flameThrower for Vulpix");
		return target;
	}
	
	public void sunnyDay(){
		System.out.println("Calling the sunnyDay for Vulpix");
	}
	
}