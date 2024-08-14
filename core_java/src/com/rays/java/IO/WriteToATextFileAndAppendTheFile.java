package com.rays.java.IO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToATextFileAndAppendTheFile{
	
	public static void main(String[] args) throws IOException {
		
		FileWriter w = new FileWriter("D://SUSHOBHIT.txt" ,true);
		
		BufferedWriter bw = new BufferedWriter(w);
		
		bw.write("Hello Sushobhit");
		bw.write("\n");
		bw.write("-------");
		char[] cArray = {'h','i'};
		bw.write(cArray);
		bw.write("-------");
		bw.write("00011101993");
		
		bw.close(); w.close();
		
		
	}

}
