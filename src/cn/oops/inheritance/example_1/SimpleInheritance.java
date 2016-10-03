package cn.oops.inheritance.example_1;

public class SimpleInheritance {
	public static void main(String args[]) {
		A a = new A();
		
		// The superclass may be used by itself.
		a.i = 10;
		a.j = 20;		
		a.showij();
		
		System.out.println();
		
		
		
		B b = new B();
		
		
		b.i = 7;
		b.j = 8;
		b.k = 9;		
		b.showij();
		b.showk();
		System.out.println();
		System.out.println("Sum of i, j and k in subOb:");
		b.sum();
	}
}