package org.test;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map1 {
public static void main(String[] args) {
	
 Map<Integer,String>m=new LinkedHashMap<>();	
	//to add values
    m.put(10,"Java");
	m.put(20,"selenium");
	m.put(30,"sql");
	m.put(40,"sql");
	m.put(50,"win");
	m.put(10,"python");
	
	System.out.println(m);
	
	//to iterate Map
	Set<Entry<Integer,String>> entryset=m.entrySet();
	for (Entry<Integer, String> entry : entryset) {
	 System.out.println(entry.getKey());	
	 System.out.println(entry.getValue());	
		
		
	}
	
}
}
