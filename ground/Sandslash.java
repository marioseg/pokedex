package com.synechron.ground;

public class Sandslash{
	
	private String weaknesses;
	private String physicalDefense;
	
	public Sandslash(String weaknesses, String physicalDefense ){
		System.out.println("Calling the constructor of Sandslash");
		this.weaknesses = weaknesses;
		this.physicalDefense = physicalDefense;
		
	}
	
	public String getWeaknesses(String weaknesses){
		System.out.println("The weaknesses for Sandslash is "+weaknesses);
		return weaknesses;
		
	}
	
	public void setWeaknesses(String weaknesses){
	     this. weaknesses = weaknesses;
	} 
	
	public String getPhysicalDefense(String physicalDefense){
		System.out.println("The physicalDefense for Sandslash is "+physicalDefense);
		return physicalDefense;
	}
	
	public void setPhysicalDefense(String physicalDefense){
		this.physicalDefense= physicalDefense;
		
	}
	
	
	public int earthQuake(int target){
		System.out.println("Calling the earthQuake for Sandslash");
		return target;
	}
	
	public void dig(int target){
		System.out.println("Calling the dig for Sandslash");
	}
	
}