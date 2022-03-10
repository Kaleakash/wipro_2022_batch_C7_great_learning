package com;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		System.out.println("Size "+hs.size());
		hs.add(10);
		hs.add(10.10);
		hs.add("Ravi");
		hs.add(10);
		System.out.println(hs);
		System.out.println("Size "+hs.size());
		System.out.println("Search "+hs.contains(10));
		System.out.println("Search "+hs.contains(100));
		hs.remove(10);
		System.out.println(hs);
		hs.clear();
		System.out.println("Size "+hs.size());
	}

}
