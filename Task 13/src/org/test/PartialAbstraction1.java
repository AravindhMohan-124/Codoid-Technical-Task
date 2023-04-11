package org.test;

public class PartialAbstraction1 implements Abstraction1 {

	@Override
	public void savings() {
		System.out.println("6%");
		
	}

	@Override
	public void deposit() {
		System.out.println("7%");
		
	}

	@Override
	public void fixed() {
		System.out.println("8%");
	}
	public static void main(String[] args) {
		PartialAbstraction1 e=new PartialAbstraction1();
		e.savings();
		e.deposit();
		e.fixed();
		
		
		
	}

	
	
	
	

}
