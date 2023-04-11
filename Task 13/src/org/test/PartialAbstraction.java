package org.test;

public class PartialAbstraction extends Abstraction {

	@Override
	public void savings() {
		System.out.println("6%");
		
	}

	@Override
	public void deposit() {
		System.out.println("9%");
	}

	public static void main(String[] args) {
		PartialAbstraction p=new PartialAbstraction();
		p.savings();
	    p.deposit();
	    p.fixed();
	}
	
	
	
	
	
	
	
	
	
}
