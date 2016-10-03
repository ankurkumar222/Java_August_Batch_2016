package cn.oops.objectandclass.examples.example_1;

public class Test {
	
	public static void main(String args[]) {
		Box mybox = new Box();		 

		mybox.width = 10;
		mybox.height = 20;
		mybox.depth = 15;

		double vol = mybox.width * mybox.height * mybox.depth;
		System.out.println("Volume is " + vol);
	}
}