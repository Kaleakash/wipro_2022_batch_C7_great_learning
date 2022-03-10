package com;

public class FinallyExample {

	public static void main(String[] args) {
		
		try {
			int a=10/1;
			System.out.println("no exception ");
		}catch (Exception e) {
			System.out.println("exception");
		}finally {
			System.out.println("finally");
		}
		System.out.println("normal statement");
	}

}
