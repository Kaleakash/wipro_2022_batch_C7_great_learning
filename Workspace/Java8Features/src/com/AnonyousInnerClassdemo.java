package com;
interface Abc {
		void dis1();
}
class Xyz implements Abc {
	public void dis1() {
		System.out.println("dis1 method provided body by Xyz");
	}
}
public class AnonyousInnerClassdemo {
	public static void main(String[] args) {
	//1st approach 
	Abc obj1 = new Xyz();
	obj1.dis1();
	//2nd approach 
	Abc obj2 = new Abc() {
		public void dis1() {
			System.out.println("This is anonymous inner class with logic 1");
		}
	};	
	obj2.dis1();
	Abc obj3 = new Abc() {
		public void dis1() {
			System.out.println("This is anonymous inner class with logic 2");
		}
	};	
	obj3.dis1();
	// 3rd approach 
	Abc obj4 = ()->System.out.println("This is Lambda expression styntax");
	obj4.dis1();
	}

}
