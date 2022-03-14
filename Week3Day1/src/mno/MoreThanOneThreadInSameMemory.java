package mno;
class A implements Runnable{
	@Override
	public void run() {
		Thread t = Thread.currentThread();
		String name = t.getName();
		for(int i=0;i<10;i++) {
			System.out.println(name+" "+i);
		}
	}
}
public class MoreThanOneThreadInSameMemory {
	public static void main(String[] args) {
		A obj1 = new A();
		Thread t1  = new Thread(obj1);
		Thread t2  = new Thread(obj1);
		Thread t3  = new Thread(obj1);
		t1.setName("1st Thread");		t2.setName("2nd Thread");	t3.setName("3rd Thread");
		t1.start(); t2.start(); t3.start();
	}

}
