package cn.oops.polymorphism.compiletime.example_1;

public class MethodOverloading {
	void fun(int num) {
		System.out.println("methodA:" + num);
	}

	void fun(int num1, int num2) {
		System.out.println("methodA:" + num1 + "," + num2);
	}

	double fun(double num) {
		System.out.println("methodA:" + num);
		return num;
	}
}