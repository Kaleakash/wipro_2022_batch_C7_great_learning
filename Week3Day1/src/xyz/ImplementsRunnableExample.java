package xyz;
class A implements Runnable{
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("i "+i);
		}
	}
}
class B implements Runnable{
	@Override
	public void run() {
		for(int j=0;j<10;j++) {
			System.out.println("j "+j);
		}
	}
}
public class ImplementsRunnableExample {
	public static void main(String[] args) {
		A obj1 = new A();
		B obj2 = new B();
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);					// thread class reference created. 
		t1.start();
		t2.start();
		
	}

}
