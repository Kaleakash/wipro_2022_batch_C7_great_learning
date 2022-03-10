package com;
class Abc implements Runnable{
	@Override
	public void run() {
	Thread t = Thread.currentThread();
	String name = t.getName();
	for(int i=0;i<10;i++) {
		System.out.println(name+" "+i);
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	}
}
class Xyz implements Runnable{
	@Override
	public void run() {
	Thread t = Thread.currentThread();
	String name = t.getName();
	for(int i=0;i<5;i++) {
		System.out.println(name+" "+i);
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
		
	}
}
public class DemoDaemonThread {
	public static void main(String[] args) {
		Abc obj1 = new Abc();
		Xyz obj2 = new Xyz(); 
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		t1.setDaemon(true);
		t1.start();
		t2.start();

	}

}
