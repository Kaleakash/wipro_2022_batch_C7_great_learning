package com;

public class TryAndCatchDemo {

	public static void main(String[] args) {
		System.out.println("Hi");
		int a=10;
		int b=1;
		int abc[]= {10,20,30,40};
		try {
				int res = a/b;
		System.out.println("Res "+res);
		int res1 = 10/abc[2];
		System.out.println("Res1 "+res1);
		System.out.println("No Exception");
		}catch (Exception e) {
			//System.out.println("I Take Care");
			System.out.println(e.toString());
		//System.out.println(e);     // toString() it will call toString()
			//System.out.println(e.getMessage());
		}
		System.out.println("bye...");
		System.out.println("Bye....");

	}

}
