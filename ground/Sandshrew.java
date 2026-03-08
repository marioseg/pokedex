package com.synechron.ground;

public class Sandshrew{
	
	private String weaknesses;
	private String physicalDefense;
	
	public Sandshrew(String weaknesses, String physicalDefense ){
		System.out.println("Calling the constructor of Sandshrew");
		this.weaknesses = weaknesses;
		this.physicalDefense = physicalDefense;
		
	}
	
	public String getWeaknesses(String weaknesses){
		System.out.println("The weaknesses for Sandshrew is "+weaknesses);
		return weaknesses;
		
	}
	
	public void setWeaknesses(String weaknesses){
	     this. weaknesses = weaknesses;
	} 
	
	public String getPhysicalDefense(String physicalDefense){
		System.out.println("The physicalDefense for Sandshrew is "+physicalDefense);
		return physicalDefense;
	}
	
	public void setPhysicalDefense(String physicalDefense){
		this.physicalDefense= physicalDefense;
		
	}
	
	
	public int earthQuake(int target){
		System.out.println("Calling the earthQuake for Sandshrew");
		return target;
	}
	
	public void dig(int target){
		System.out.println("Calling the dig for Sandshrew");
	}
	
}