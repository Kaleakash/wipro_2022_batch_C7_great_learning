package com;
class Demo {
	int a=20;
		static int b;
	void dis1() {
		System.out.println("a "+a);
		System.out.println("b "+b);
	}
}
class Demo1 extends Demo{
	int a=10;
	void dis1() {
		int a=100;
		System.out.println("a "+a);  // a =100;
		System.out.println("a "+this.a); // a=10;
		System.out.println("a "+super.a); // a=20;
		
	}
}
public class StaticDemo2 {
	public static void main(String[] args) {
			Demo obj1 = new Demo();		// heap memory 
			Demo obj2 = new Demo();
				obj1.a=10;
					Demo.b=20;
						obj1.b=30;
							obj2.a=40;
								Demo.b=50;
									obj2.b=60;
	obj1.dis1();		//  a = 10		b =	60 
	obj2.dis1();		// 	a=	40		b=	60 
	Demo d = new Demo1();
	System.out.println(d.a);
	}

}
