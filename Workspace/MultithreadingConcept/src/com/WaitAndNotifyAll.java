package com;
class Operation implements Runnable{
	@Override
	public synchronized void run() {
	Thread t = Thread.currentThread();
	String name = t.getName();
			for(int i=0;i<10;i++) {
				System.out.println(name+" "+i);
				try {
				Thread.sleep(1000);
				
				if(name.equals("Raj") && i==4) {
					wait();
				}
				if(name.equals("Ajay") && i==6) {
					notify();
				}
				}catch (Exception e) {
					// TODO: handle exception
				}
			}
	}
}
public class WaitAndNotifyAll {

	public static void main(String[] args) {
		Operation op = new Operation();
		Thread t1 = new Thread(op);
		Thread t2 = new Thread(op);
		Thread t3 = new Thread(op);
		t1.setName("Raj");
		t2.setName("Ajay");
		t3.setName("Mahesh");
		t1.start();
		t2.start();
		t3.start();
	}

}
