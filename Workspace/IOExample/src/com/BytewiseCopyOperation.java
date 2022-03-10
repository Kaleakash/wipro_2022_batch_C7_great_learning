package com;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class BytewiseCopyOperation {

	public static void main(String[] args) throws Exception{
//		FileInputStream fis = new FileInputStream("abc.txt");
//		FileOutputStream fos = new FileOutputStream("demo.txt");
//		int ch;
//		while((ch = fis.read()) != -1) {	// EOF is -1 in java 
//				fos.write(ch);
//		}
//		System.out.println("file copied...");
		
		FileReader fis = new FileReader("abc.txt");
		FileWriter fos = new FileWriter("demo.txt");
		int ch;
		while((ch = fis.read()) != -1) {	// EOF is -1 in java 
				fos.write(ch);
		}
		System.out.println("file copied...");
	}

}
