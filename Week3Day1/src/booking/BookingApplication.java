package booking;
class Booking implements Runnable{
	int avl=1;
	@Override
	public synchronized void run() {
		Thread t = Thread.currentThread();
		String name = t.getName();
		if(avl==1) {
			System.out.println(name+" got the ticket");
			avl=avl-1;
		}else {
			System.out.println(name+" sorry no ticket");
		}
	}
}
public class BookingApplication {
	public static void main(String[] args) {
	Booking b1 = new Booking();					// avl = 1
	Booking b2 = new Booking();					// avl=1
	Booking b3 = new Booking();					// avl=1
	Thread t1 = new Thread(b1);
	Thread t2 = new Thread(b2);
	Thread t3 = new Thread(b3);
	t1.setName("Raj"); t2.setName("Mahesh"); t3.setName("Ajay");
	t1.start(); t2.start();  t3.start();
	}

}
