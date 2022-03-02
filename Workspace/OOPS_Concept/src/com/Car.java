package com;

public class Car {
int wheel;
String color;
float price;

void displayCarInfo() {
	System.out.println("wheel "+wheel);
	System.out.println("color "+color);
	System.out.println("price "+price);
}


void start() {
		int a=10;
		System.out.println("Cart Started...");
		System.out.println("wheel "+wheel);
		System.out.println("color "+color);
		System.out.println("price "+price);
		System.out.println("a "+a);
}

void stop() {
	String msg="Welcome";
	System.out.println("Car stop");
	System.out.println("wheel "+wheel);
	System.out.println("color "+color);
	System.out.println("price "+price);
	System.out.println("msg "+msg);
}

}
