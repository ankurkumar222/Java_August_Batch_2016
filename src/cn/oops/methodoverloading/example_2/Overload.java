package cn.oops.methodoverloading.example_2;

//Automatic type conversions apply to overloading.
class Overload {
	void test() {
		System.out.println("No parameters");
	}
	
	void test(int a, int b) {
		System.out.println("a and b: " + a + " " + b);
	}

	void test(double a) {
		System.out.println("Inside test(double) a: " + a);
	}
}

