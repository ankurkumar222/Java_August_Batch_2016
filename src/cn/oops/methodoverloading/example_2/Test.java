package cn.oops.methodoverloading.example_2;
public class Test {
	public static void main(String args[]) {
		Overload ob = new Overload();
		int i = 88;
		ob.test();
		ob.test(10, 20);
		ob.test(i); 
		ob.test(123.2); 
	}
}
