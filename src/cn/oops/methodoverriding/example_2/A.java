package cn.oops.methodoverriding.example_2;

class A {
	int i, j;

	A(int a, int b) {
		i = a;
		j = b;
	}

	void show() {
		System.out.println("i and j: " + i + " " + j);
	}
}