package cn.oops.methodoverloading.example_3;
/*
 * Method Overloading is not possible by changing the return type of method
 * */
public class Calculation3 {
	public static int sum(int a, int b) {
		System.out.println(a + b);
		return a+b;
	}

	public static double sum(int a, int b) {
		System.out.println(a + b);
		double sum = a+b;
		return sum;
	}

	public static void main(String args[]) {
		int result = sum(20, 20); 
	}
}