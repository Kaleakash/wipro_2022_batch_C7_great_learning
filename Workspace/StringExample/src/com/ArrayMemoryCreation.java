package com;

import java.util.Scanner;

public class ArrayMemoryCreation {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("How details do you want to store");
		int n = sc.nextInt();
		int []id=new int[n];
		String []names=new String[n];
		
		for(int i=0;i<n;i++) {
			System.out.println("Enter id and name of "+(i+1));
			id[i]=sc.nextInt();
			names[i]=sc.next();
		}
		System.out.println("Add details are ");
		for(int i=0;i<n;i++) {
			System.out.println("id is "+id[i]+" Name is "+names[i]);
		}
	}

}
