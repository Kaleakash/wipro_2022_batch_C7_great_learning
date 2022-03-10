package com;

public class NestedTryAndCatch {

	public static void main(String[] args) {
		System.out.println("Hi");
		int a=10;
		int b=0;
		int abc[]= {10,20,30,40};
		String abcd = "a1";
		try {
				try {
					int res = abc[Integer.parseInt(abcd)]/b;
					System.out.println(res);
				}catch (ArrayIndexOutOfBoundsException e1) {
					System.out.println("inner catch");
				}
			
		}catch (ArithmeticException e1) {
				System.out.println("Outer catch ");
		}
		System.out.println("bye...");
		System.out.println("Bye....");

	}

}
