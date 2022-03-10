package com;
class MyException extends Exception{
	public MyException() {
		// TODO Auto-generated constructor stub
	}
	public MyException(String msg) {
		super(msg);				// calling Exception parameter constructor 
	}
}
public class ThrowExample {

	public static void main(String[] args) {

		int a=10;
		int b=5;
		try {
			
			if(a>b) {
				//throw new Exception();  // generic exception 
				//throw new ArithmeticException();	// specific exception 
				//throw new ArithmeticException("a>b");	// specific exception 
				//throw new MyException();
				throw new MyException("a>b");
			}
			
		}catch (Exception e) {
		System.out.println(e.toString());	
		}

	}

}
