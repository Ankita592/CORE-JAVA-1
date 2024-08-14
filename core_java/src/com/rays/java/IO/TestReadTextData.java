package com.rays.java.IO;

import java.io.FileReader;
import java.io.IOException;



public class TestReadTextData {
	
	public static void main(String[] args) throws IOException {
		
		FileReader reader = new FileReader("D:/Hello.txt");
		
		// read char as ASCII 
		
		int i = reader.read();
		
		
		// i is -1 if more char is left in file
		
		while(i != -1) {
			System.out.println((char)i);
			i= reader.read();
		}
		reader.close();
		
		
	}

}
