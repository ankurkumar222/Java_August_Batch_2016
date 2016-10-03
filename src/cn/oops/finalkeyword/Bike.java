package cn.oops.finalkeyword;

/*
 Java final variable
 -------------------
 	If you make any variable as final, you cannot change the value of final variable
 */
public class Bike {
	final int speedlimit ;
	public Bike() {
		speedlimit = 10;
	}

	void run() {
		speedlimit = 400;
	}

	public static void main(String args[]) {
		Bike obj = new Bike();
		
		obj.run();
	}
}