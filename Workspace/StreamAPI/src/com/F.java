package com;

class X{
	void mno(){
		System.out.println("ram");
	}
}
class F{
		
		
		X x = new X(){
			void mno(){
				System.out.println("shyam");
				pqr();
			}
			void pqr(){
				System.out.println("ritik");
			}
		};
		

	public static void main(String[] args){
		
	F obj = new F();
	obj.x.mno();
	//obj.x.pqr();
	}
}

