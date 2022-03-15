package com;
interface Operation {
	public int add(int x, int y);
}
interface FindLargest{
	public boolean find(int x, int y);
}
class OperationImp implements Operation{
	public int add(int x, int y) {
		return x+y;
	}
}
public class LambdaExpressonExample {
	public static void main(String[] args) {
		Operation op = new OperationImp();
		op.add(100, 200);
		
			Operation op1 = (x,y)->x+y;
		System.out.println(op1.add(100, 200));
			Operation op2 = (a,b)->a+b;
		System.out.println(op2.add(100, 200));
			Operation op3 = (int x, int y)->x+y;
		System.out.println(op3.add(100, 300));
			Operation op4 = (int x, int y)-> {
			int sum= x+y;
			return sum;
			};
		System.out.println(op4.add(1, 2));
			FindLargest lf1 = (int x, int y)->x>y;
		System.out.println(lf1.find(10, 5));
			FindLargest lg2 = (int x, int y)-> {
			if(x>y) {
				return true;
			}else {
				return false;
			}
		};
		System.out.println(lg2.find(5, 10));
	}

}
