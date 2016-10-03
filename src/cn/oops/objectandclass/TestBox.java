package cn.oops.objectandclass;

public class TestBox {
	public static void main(String[] args) {
		Box b1 = new Box(10,20,30);
		
		
		Box b2 = new Box(22,3,2);
		
		Box b3 = new Box();
		Box b4 = new Box(10,23);
		
		int vol= b1.volume();
		System.out.println(vol);
		
		
		vol= b2.volume();
		System.out.println(vol);
		
		
		vol = b4.volume();
		System.out.println(vol);
	}
}
