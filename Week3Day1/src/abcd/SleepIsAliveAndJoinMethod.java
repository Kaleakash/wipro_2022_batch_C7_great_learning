package abcd;
class A implements Runnable{
		@Override
		public void run() {
			Thread t = Thread.currentThread();
			String name = t.getName();
//			System.out.println("Hi ");
//			System.out.println("First Thread details "+name);
			for(int i=0;i<10;i++) {
				System.out.println(name +"="+i);
								try {
								Thread.sleep(1000);
								}catch (Exception e) {}
			}
		}
}
class B implements Runnable{
		@Override
		public void run() {
			Thread t = Thread.currentThread();
			String name = t.getName();
//			System.out.println("Hello ");
//			System.out.println("Second Thread details "+name);
			for(int i=0;i<10;i++) {
				System.out.println(name +"="+i);
				try {
					Thread.sleep(500);
					}catch (Exception e) {}
			}
		}
}
public class SleepIsAliveAndJoinMethod {
	public static void main(String[] args) throws Exception{
		A obj1 = new A();
		B obj2  = new B();
		Thread t = Thread.currentThread();
		System.out.println("Default Thread details "+t);
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		//System.out.println("First Thread status "+t1.isAlive());
		//System.out.println("Second Thread status "+t2.isAlive());
		t1.setName("1st Bike");
		t2.setName("2nd Bike");
		t1.setPriority(1);
		t2.setPriority(10);
		System.out.println("1....");
		Thread.sleep(1000);
		System.out.println("2....");
		Thread.sleep(1000);
		System.out.println("3....");
		Thread.sleep(1000);
		System.out.println("Game Start");
		t1.start();
		t2.start();
		t1.join();
		t2.join();      // so Thread t2 will join for main thread after this line the code execute only if t2 thread get destory. 
		System.out.println("Game finished...");
	//	System.out.println("First Thread status "+t1.isAlive());
	//	System.out.println("Second Thread status "+t2.isAlive());
	}

}
