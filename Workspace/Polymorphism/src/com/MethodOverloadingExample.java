package com;
class Operation {
	void add(int a, int b) {
		System.out.println(a+b);
	}
	void add(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	void add(float a, float b) {
		System.out.println(a+b);
	}
	void add(String x, String y) {
		System.out.println(x+y);
	}
}
public class MethodOverloadingExample {
	public static void main(String[] args) {
	Operation op = new Operation();
	op.add(10, 20);
	op.add(10, 20, 30);
	op.add("10","20");
	}
}
