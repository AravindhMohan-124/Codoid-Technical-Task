package org.test;

public class Bank extends MethodOverriding {
	
	
	@Override
	public void savings() {
		System.out.println("6%");
		
	}
	
	private void fixed() {
		System.out.println("8%");
	}
	
	public static void main(String[] args) {
		Bank b=new Bank();
		b.savings();
		b.deposit();
		b.fixed();
		
		
		
	}
	
	
	
	
	

}
