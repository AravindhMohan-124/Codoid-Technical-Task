package org.test;

public class Greens {
public static void main(String[] args) {
	
	String s="going to gym";
	
	int length = s.length();
	
	char[] ch = s.toCharArray();
	
	for (int i = 0; i <length; i++) {
		
	for (int j = i+1; j < ch.length; j++) {
     
		if(ch[i]==ch[j])
		{  
		System.out.println("Duplicate Characters are:    "+ch[j]);
		
		
		
	}	
		
		
		
		
		
	}
	
	
	}
}
}
