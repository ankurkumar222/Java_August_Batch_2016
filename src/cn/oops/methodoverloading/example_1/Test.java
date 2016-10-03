package cn.oops.methodoverloading.example_1;

public class Test {

	public static void main(String args[]) {
		Overload ob = new Overload();
		ob.test();
		ob.test(10);
		ob.test(10, 20);
		ob.test(123.25);
	}
}