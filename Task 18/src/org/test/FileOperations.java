package org.test;

import java.io.File;

public class FileOperations {

	public static void main(String[] args) {
		
		
	File f=new File("D:\\New");	
		
	//to create folder	
	boolean mkdir = f.mkdir();	
	System.out.println(mkdir);	
	
	//to check wheather the file is read or not
	boolean canRead = f.canRead();	
	System.out.println(canRead);	
	
	//to check wheather the file is write or not
	boolean canWrite = f.canWrite();	
	System.out.println(canWrite);	
	}
	
	
	
	
	
	
}
