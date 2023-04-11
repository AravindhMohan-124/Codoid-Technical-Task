package org.test;

public class DiffArgs {

	
	//Datatype Count
   public void companyDetails(String Name,int id,Long phno) {
	System.out.println("company name:"+Name+"\n company id:"+id+"\n company phno:"+phno);	

	}
	
	//Datatype
	public void companyDetails(String City) {
	System.out.println("company location:"+City);

	}
	
    //Datatype Order
	
	public void companyDetails(int pincode) {
		System.out.println("Company Adress pincode:"+pincode);

	}
	
	public static void main(String[] args) {
		
		DiffArgs d=new DiffArgs();
		d.companyDetails("Vtech",1234, 987654321l);
		d.companyDetails("Cheenai");
		d.companyDetails(600028);
		
	}
	
	
	
	
}
