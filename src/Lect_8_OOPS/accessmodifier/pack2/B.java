package Lect_8_OOPS.accessmodifier.pack2;

import Lect_8_OOPS.accessmodifier.pack1.A;

public class B extends A {
	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.x);
		a.fun();

	}
}
