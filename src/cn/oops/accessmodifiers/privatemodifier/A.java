package cn.oops.accessmodifiers.privatemodifier;

class A {
	int data = 40;

	public void msg() {
		System.out.println("Hello java");
	}
	
	public void fun(){
		msg();
		int x = data;
	}
}

class B{
	public static void main(String[] args) {
		A a = new A();
		a.fun();
		a.msg();
	}
}