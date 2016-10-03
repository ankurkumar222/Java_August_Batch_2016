package cn.oops.abstractclass.example1;

public class TestBank {
	public static void main(String args[]) {
		Bank b = new SBI();
		b.getRateOfInterest();
		b = new PNB();
		b.getRateOfInterest();
		
	}
}