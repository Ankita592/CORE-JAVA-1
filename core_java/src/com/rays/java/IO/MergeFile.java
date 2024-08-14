package com.rays.java.IO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MergeFile {
	public static void main(String[] args) throws IOException {
		
		FileWriter fr = new FileWriter("D:/HelloWorld.txt");
		
		BufferedReader br = new BufferedReader(new FileReader("D:/SUSHOBHIT.txt"));
		
		String s1 = br.readLine();
		
		while(s1 != null) {
			
			fr.write(s1);
			
			s1 = br.readLine();
		}
		fr.write("\n");
		br.close();
		
		br = new BufferedReader(new FileReader("D:/Hello.txt"));
		
		String s2 = br.readLine();
		
		while(s2 != null ) {
			
			fr.write(s2);
			
			s2 = br.readLine();
			
		}
		
		br.close();
		fr.close();
		
		System.out.println(" successfull");
		
	}

}
