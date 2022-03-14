package com;

import java.io.DataInputStream;
import java.io.FileOutputStream;

public class ByteWiseFileOperation {

	public static void main(String[] args) throws Exception{
		DataInputStream dis = new DataInputStream(System.in);
		FileOutputStream fos = new FileOutputStream("abc.txt");
		System.out.println("enter the text");
		int ch;
		while((ch= dis.read()) != '@') { //EOF = -1 
			fos.write(ch);
			System.out.print(ch+" "+(char)ch);
		}
		fos.close();
	}

}
