package Lect_8_OOPS.methodoverriding;

public class C {
	public static void main(String[] args) {
		A a = new A();
		a.fun();
		
		B b = new B();
		b.fun();
		
		B b1 = new A();
		A a2 = new B();
	}
}
