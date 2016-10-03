package cn.oops.statickeyword;

class C {

	int roll;
	String name;
	static int age;
	
	public void fun() {

	}
}

public class B {
	static int age;
	public B(){
		
	}
	public  static void fun(){
		System.out.println(age);
	}
	public static void main(String[] args) {
		//fun();
		//C.fun();
		B b = new B();
		b.fun();
	}
}





