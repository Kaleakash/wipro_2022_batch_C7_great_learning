package abc1;
class Abc implements Runnable{
	@Override
	public synchronized void run() {
		Thread t = Thread.currentThread();
		String name  = t.getName();
		for(int i=0;i<10;i++) {
			System.out.println(name+" "+i);
			try {
				Thread.sleep(500);
				if(i==4 && name.equals("Ajay")) {
					wait();
				}
				if(i==6 && name.equals("Mahesh")) {
					notify();   //
					wait();
				}
				
			} catch (Exception e) {}
		}
	}
}
public class WaitAndNotifyExample {
	public static void main(String[] args) {
		Abc obj = new Abc();
		Thread t1 = new Thread(obj);
		Thread t2 = new Thread(obj);
		Thread t3 = new Thread(obj);
		t1.setName("Ajay"); t2.setName("Vijay"); t3.setName("Mahesh");
		t1.start(); t2.start(); t3.start();
	}

}
