package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

class MyConsumer implements Consumer<Integer>{

	@Override
	public void accept(Integer t) {
		System.out.println("Value of t is "+t);
	}
	
}
//class MyConsumer1 implements Consumer<String>{
//	@Override
//	public void accept(String t) {
//		System.out.println("Value of t is "+t);
//	}
//}
public class ForEachFunctionDemo {
	public static void main(String[] args) {
	Consumer<Integer> c1 = new MyConsumer();
	c1.accept(100);
	
	Consumer<Integer> c2 = (v)->System.out.println("Value is in lambda expression "+v);
	c2.accept(200);
	
	List<String> listOfStd = new ArrayList<>();
	System.out.println();
	listOfStd.add("Ravi"); listOfStd.add("Ramesh"); listOfStd.add("Raju"); listOfStd.add("Mahesh");
	System.out.println("Enhaced loop");
	for(String name:listOfStd) {
		System.out.println("Name "+name);
	}
	System.out.println("using Iterator");
	Iterator<String> li = listOfStd.iterator();
	while(li.hasNext()) {
		String name = li.next();
		System.out.println("name "+name);
	}
//	Consumer<String> cc1 = new MyConsumer1();
//	listOfStd.forEach(cc1);
	System.out.println("Using lambd expression");
	listOfStd.forEach((String v)->System.out.println("Value of v is logic 1 "+v));
	listOfStd.forEach((v)->System.out.println("Value of v is logig 2"+v));
	}

}



