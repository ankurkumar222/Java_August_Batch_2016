package cn.oops.methodoverloading.constructoroverloading;

public class A {

	static A a;
	private A(){
		
	}
	
	public static  A fun(){
		 a = new A();
		return a;
	}
}


class B{
	A a = A.fun();
	A b = A.fun();
}