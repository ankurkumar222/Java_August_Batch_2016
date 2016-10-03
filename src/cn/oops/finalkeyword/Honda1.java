package cn.oops.finalkeyword;

/*
 Java final class

 If you make any class as final, you cannot extend it.

 
 */
final class Bike1 {
}

public class Honda1 extends Bike1 {
	void run() {
		System.out.println("running safely with 100kmph");
	}

	public static void main(String args[]) {
		Honda1 honda = new Honda1();
		honda.run();
	}
}