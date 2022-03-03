package com;
abstract class Bike {
	abstract void speed();
}
class Honda extends Bike {
	void color() {
		System.out.println("Gray");
	}
	void speed() {
		System.out.println("90km/hr");
	}
}
public class AbstractTest {
	public static void main(String[] args) {
		Honda hh = new Honda();
	}
}
