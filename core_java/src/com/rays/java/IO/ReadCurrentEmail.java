package com.rays.java.IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadCurrentEmail {
	
	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("D://newemail.txt");
		
		BufferedReader br = new BufferedReader(new FileReader("D://email.txt"));
		
		String s1 = br.readLine();
		
		String emailreg = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        
		
		while(s1.matches(emailreg)) {
			
			fw.write(s1);
			
			System.out.println(s1);
			
			s1 = br.readLine();
			
			
		}
		
		fw.close();
		br.close();
	}

}
