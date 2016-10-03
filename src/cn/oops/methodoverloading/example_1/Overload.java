package cn.oops.methodoverloading.example_1;

class Overload {

	public int fun(int a) {
		return 0;
	}

	public double fun(char a) {

		return 0.0;
	}

	/*
	 * public void fun(int a, int b){ System.out.println("inside fun 2"); }
	 * 
	 * public void fun(double x){ System.out.println("inside fun 3"); }
	 */
	public static void main(String[] args) {
		Overload o = new Overload();
		double x = o.fun(10);
	}
}
