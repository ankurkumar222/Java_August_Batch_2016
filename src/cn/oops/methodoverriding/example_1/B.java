package cn.oops.methodoverriding.example_1;

public class B extends A {
	int k;

	B(int a, int b, int c) {
		super(a, b);
		k = c;
	}

	
	void show() {
		super.show();
		System.out.println("k: " + k);
	}
	
	
	public static void main(String[] args) {
		B b = new B(5,10,30);
		
		
	}
	
}









