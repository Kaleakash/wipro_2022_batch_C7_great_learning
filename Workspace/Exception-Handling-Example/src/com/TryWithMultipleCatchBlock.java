package com;

public class TryWithMultipleCatchBlock {

	public static void main(String[] args) {
		System.out.println("Hi");
		int a=10;
		int b=1;
		int abc[]= {10,20,30,40};
		String abcd = "a10";
		try {
	int res = a/b;
		System.out.println("Res "+res);
		int res1 = 10/abc[2];
		System.out.println("Res1 "+res1);
				int res2 = Integer.parseInt(abcd);		// convert string to integer 
		System.out.println(res2+100);
		System.out.println("No Exception");
		}catch (ArithmeticException | NumberFormatException e1) {
				System.out.println("Divide by zero or NumberFormat");
		}catch (ArrayIndexOutOfBoundsException e1) {
					System.out.println("Wrong index position");
		}catch(Exception e) {
			System.out.println("Generic Exception");
		}
		System.out.println("bye...");
		System.out.println("Bye....");

	}

}
