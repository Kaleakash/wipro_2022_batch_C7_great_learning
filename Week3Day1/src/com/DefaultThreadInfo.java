package com;

public class DefaultThreadInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Thread t = Thread.currentThread();
			System.out.println(t);
			t.setName("Demo Thread");
			System.out.println(t);
			t.setPriority(1);
			System.out.println(t);
			//t.setPriority(12); it throw unchecked exception ie IllegalArgumentException
			t.setPriority(Thread.MAX_PRIORITY);
			System.out.println(t);
	}

}
