package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapImplementation {

	public static void main(String[] args) {
		List<Book> listOfBook = new ArrayList<>();
		Book b1 = new Book();
		b1.setBid(1);
		b1.setName("Comedy");
		b1.setPrice(500);
		
		Book b2 = new Book();
		b2.setBid(2);
		b2.setName("Fiction");
		b2.setPrice(1000);
		listOfBook.add(b1);
		listOfBook.add(b2);
		
		List<Book> listOfBook1 = new ArrayList<>();
		Book b3 = new Book();
		b3.setBid(3);
		b3.setName("Comedy12");
		b3.setPrice(1500);
		
		Book b4 = new Book();
		b4.setBid(4);
		b4.setName("Fiction12");
		b4.setPrice(1000);
		
		listOfBook1.add(b3);
		listOfBook1.add(b4);
		listOfBook1.add(b1);
		
		Map<String, List<Book>> mm =new HashMap<>();
		mm.put("Akash", listOfBook);				// 2 books 
		mm.put("Anuj", listOfBook1);				// 3 books 
	}

}
