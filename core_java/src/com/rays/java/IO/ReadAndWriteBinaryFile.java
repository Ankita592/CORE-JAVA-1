package com.rays.java.IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadAndWriteBinaryFile {
	
	public static void main(String[] args) throws IOException {
		
		String source  = "D:/DSC01.JPG";
		
		String target = "D:/DSC02.JPG";
		
		FileInputStream in = new FileInputStream(source);
		
		FileOutputStream out = new FileOutputStream(target);
		
		int ch = in.read();
		
		while (ch != -1) {
			
			out.write(ch);
			
			ch = in.read();
		}
		out.close(); in.close();
		
		System.out.println(" successfully----");
		
		
		
		
		
	}

}
