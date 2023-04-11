package org.test;

public class MethodOverloading {

	public void empdetails(String Name) {
		System.out.println("Employee name:"+Name);

	}
	public void empdetails(Float Salary) {
		System.out.println("Employee Salary:"+Salary);

	}
	
	public void empdetails(Long Phno) {
	   System.out.println("Emplyoee Phno:"+Phno);

	}
	
	public void empdetails(int id) {
		System.out.println("Employee id:"+id);
	}
	
	public static void main(String[] args) {
		
	MethodOverloading m=new MethodOverloading();
	m.empdetails("Aravindh");
	m.empdetails(1234);
	m.empdetails(987.234f);
	m.empdetails(8870162625l);
	
	
	
		
		
		
	}
	
	
	
	
	
}
