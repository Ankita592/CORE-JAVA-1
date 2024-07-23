
package com.rays.javastring;

public class VowelCount {
	public static void main(String[] args) {
		String name= "naman";
		int vowelcount = 0;
		
		for (int i = 0; i< name.length();i++) {
			char ch = name.charAt(i);
			
			if (ch == 'a'||ch =='e'||ch == 'i'||ch == 'o'||ch == 'u' ) {
				vowelcount++;
			}
		}
		System.out.println("number of vowels in the entered string:" + vowelcount);
	}
		
	}


