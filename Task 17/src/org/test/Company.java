package org.test;

import java.util.ArrayList;
import java.util.List;

public class Company {

	public static void main(String[] args) {
		
		
	List <Encapsulation> li=new ArrayList();	
		
	//1st emp info	
	Encapsulation e=new Encapsulation();
	
	e.setId(100);
	e.setName("Bala");	
	e.setPhno(987654321l);	
		
	//2nd emp info	
	Encapsulation e1=new Encapsulation();
	
	e1.setId(200);
	e1.setName("Aravindh");
	e1.setPhno(8768642146l);
	
	li.add(e);
	li.add(e1);
	
	System.out.println("for loop Iteration");
	
	for (int i = 0; i <li.size(); i++) {
		
	System.out.println(li.get(i).getId());	
	
	System.out.println(li.get(i).getName());
	
	System.out.println(li.get(i).getPhno());
	
	
	}
	
	System.out.println();
	
	System.out.println("for each iteration");
	
	for (Encapsulation x : li) {
		
		System.out.println(x.getId());
		
		System.out.println(x.getName());
		
		System.out.println(x.getPhno());
	}	
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
