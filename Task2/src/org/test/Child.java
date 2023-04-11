package org.test;

public class Child implements MultipleInheritance,MultipleInheritance2 {

	@Override
	public void test3() {
	  System.out.println("test 3 is Completed");
		
	}

	@Override
	public void test1() {
		System.out.println("test 1 is Completed");
		
	}

	@Override
	public void test2() {
		System.out.println("test 2 is Completed");
		
	}

	public static void main(String[] args) {
		
	 Child c=new Child();
	 c.test1();
	 c.test2();
	 c.test3();
		
		
		
		
		
		
	}
	
	
	
	
	
	
}
