package com;
class Outer {
	void dis1() {
		System.out.println("dis1 method part of outer class");
		Inner1 obj = new Inner1();
		obj.dis2();
	}
	// number of outer class object. 
	class Inner1 {
		void dis2() {
			System.out.println("dis2 method part of non static inner class");
		}
	}
	// one copy 
	static class Inner2 {
		void dis3() {
			System.out.println("dis3 method part of static inner class");
		}
	}
}
public class InnerClassExample {
	public static void main(String[] args) {
		Outer out = new Outer();
		out.dis1();
		// syntax to create the non static inner class object
		// one way 
		Outer.Inner1 in1 = out.new Inner1();
		in1.dis2();
		Outer.Inner1 in2 = new Outer().new Inner1();
		in2.dis2();
		// syntax to create the static inner class object 
		Outer.Inner2 in3 = new Outer.Inner2();
		in3.dis3();
	}

}
