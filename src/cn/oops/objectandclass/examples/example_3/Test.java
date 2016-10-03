package cn.oops.objectandclass.examples.example_3;

public class Test {
	public static void main(String args[]) {
		Box b1 = new Box();
		b1.depth = 10;
		b1.height = 20;
		b1.width = 30;
		
		b1.volume();
		Box b2 = new Box();
		b2.depth = 100;
		b2.height = 200;
		b2.width = 30;
		
		b2.volume();
		
		System.out.println(b2.volume);
	}
}