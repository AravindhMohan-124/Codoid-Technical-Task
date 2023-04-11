package org.cts;

public class ConstructorOverloading {

	public  ConstructorOverloading() {
		this(1234);
	System.out.println("Default Constructor");
	
	
	}	
	
	public  ConstructorOverloading(String Name) {
	    
		System.out.println("String para Constructor:"+Name);
	
	
	
	}
	public  ConstructorOverloading(int id) {
		this("java");
	System.out.println("Int para Constructor:"+id);
	
	
}
	
	public static void main(String[] args) {
		
		ConstructorOverloading c=new ConstructorOverloading();
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
}