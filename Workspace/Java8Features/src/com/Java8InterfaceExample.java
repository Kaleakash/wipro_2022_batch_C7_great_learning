package com;
interface A {
	void dis1();
	default void dis2() {
		System.out.println("This is A interface default method dis2()");
	}
	default void dis3() {
		System.out.println("This is A interface default method dis3()");
	}
	static void dis4() {
		System.out.println("This is a interface static method");
	}
}
class B implements A {
	@Override
	public void dis1() {
		System.out.println("A interface method");
	}
	@Override
	public void dis2() {
		System.out.println("B class overrided default method part of A interface");
	}
	//@Override
	public static void dis4() {
		System.out.println("B class its own method");
	}
}
public class Java8InterfaceExample {

	public static void main(String[] args) {
		B obj1 = new B();
		obj1.dis1();
		obj1.dis2();
		obj1.dis3();
		A.dis4();	
		obj1.dis4();      // B class its own method 
		B.dis4();          // B class itw own method 
	} 

}
