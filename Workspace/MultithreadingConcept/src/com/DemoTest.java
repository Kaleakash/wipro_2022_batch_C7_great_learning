package com;
class Booking implements Runnable{
	int avl = 1;
	@Override
	public synchronized void run() {
			Thread t = Thread.currentThread();
			String name = t.getName();
			if(avl==1) {
				System.out.println(name +" got the ticket");
				avl =0;
			}else {
				System.out.println(name+" sorry no ticket");
			}
	}
}
class CancelTicket implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Cancel ticket");
	}
}
public class DemoTest {
	public static void main(String[] args) {
		Booking b1 = new Booking();			// avl = 1 
		CancelTicket ct = new CancelTicket();
		//Booking b2 = new Booking();			// avl = 1
		//Booking b3 = new Booking();			// avl = 1
		Thread t1 = new Thread(b1);
		Thread t2 = new Thread(b1);
		Thread t3 = new Thread(b1);
		Thread t4 = new Thread(ct);
		t1.setName("Raj");
		t2.setName("Ravi");
		t3.setName("Ramesh");
		t4.setName("Ajay");
		t1.start();			t2.start();		t3.start(); t4.start();
	}

}
