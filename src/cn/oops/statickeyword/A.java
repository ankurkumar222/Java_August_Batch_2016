package cn.oops.statickeyword;

/*
 * 
 Restrictions for static method
 ------------------------------
 The static method can not use non static data member or method directly.
 */


class A {
	int a = 40;// non static

	public static void main(String args[]) {
		System.out.println(a);
	}
}
