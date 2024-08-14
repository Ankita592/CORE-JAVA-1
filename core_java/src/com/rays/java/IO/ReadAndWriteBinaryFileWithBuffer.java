package com.rays.java.IO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadAndWriteBinaryFileWithBuffer {
	
	public static void main(String[] args) throws IOException {
		
		String source  = "D:/DSC01.JPG";
		String target = "D:/ygf.JPG";
		
		BufferedInputStream in = new BufferedInputStream(new FileInputStream(source));
		
		BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(target));
		
		int count = in.read();
		
		while( count != -1) {
			
			out.write(count);
			
			count = in.read();
			
		}
		out.close();
		
		System.out.println("successfully ---- ");
		
	}

}
