package com.rays.java.IO;

import java.io.File;
import java.util.Date;

public class TestFileHandling {
	
	public static void main(String[] args) {
		
		File f = new File("D:/Hello.txt");
		
		// check if file exists
		
		if (f.exists()) {
			
			System.out.println("Name of the file = " + f.getName());
			
		// path of the file
			
			System.out.println("Path of the file: "+ f.getPath());
			
		// check access permission for read and write
			
			System.out.println("Access permission "+ f.canRead()+" " + f.canWrite());
			
		// check if it is directory or a file
			
			System.out.println(" Is file " + f.isFile());
			System.out.println(" Is Directory " + f.isDirectory());
			
		//  last modified date of file
			
			Date d = new Date(f.lastModified());
			System.out.println(" Date modified " + d);
			
		// length of file
			
			System.out.println(" Length of file = " + f.length() +" bytes ");
			
			
		}else {
			
			System.out.println("File does not exist");
		}
	}

}
