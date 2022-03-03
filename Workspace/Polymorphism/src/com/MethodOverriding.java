package com;
class Bike {
	void speed() {
		System.out.println("60km/hr");
	}
}
class Honda extends Bike {
	void color() {
		System.out.println("Gray");
	}
}
class Pulsar extends Bike {
	@Override
	void speed() {
		System.out.println("90km/hr");
	}
	void color() {
		System.out.println("Black");
	}
}
class Tvs extends Bike {
	void color() {
		System.out.println("Black");
	}
	void speed() {
		super.speed();						// calling super class speed method + 
		System.out.println("10km/hr");			// its own method 	merge both methods 
	}
}
public class MethodOverriding {
	public static void main(String[] args) {
		Honda hh = new Honda();		hh.color();	hh.speed();
		Pulsar pu = new Pulsar();	pu.color(); pu.speed(); 
		Tvs tv = new Tvs();			tv.color(); tv.speed(); 
	}
}
