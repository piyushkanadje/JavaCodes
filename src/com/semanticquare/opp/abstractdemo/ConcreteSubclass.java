package com.semanticquare.opp.abstractdemo;

public class ConcreteSubclass extends AbstractSubclass {
	@Override
	void test2() {
		System.out.println("test2");
	}

	@Override
	void test3() {
		System.out.println("test3");
	}

	static int fun(long n) {

		int count = 0;
		while (n != 0) {
			
			n = n/10;
			 ++count;
			

		}
		 System.out.println(count);
		return count;
	}
	
	static int funn(long n) {
		if(n<=0) {
			return 0;
		}
		
		return 1 + funn(n/10);
		System.out.println( 1 + funn(n/10));
	}

	static int log(long n) {
		 	
		return 
		
	}


	public static void main(String[] args) {
		ConcreteSubclass concrete = new ConcreteSubclass();
		 fun(4000);
		 System.out.println();
		// AbstractSuperclass test = new AbstractSuperclass();
	}
}
