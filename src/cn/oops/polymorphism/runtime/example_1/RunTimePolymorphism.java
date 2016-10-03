package cn.oops.polymorphism.runtime.example_1;

public class RunTimePolymorphism {
	public static void main(String args[]) {
		Bank b1 = new SBI();
		Bank b2 = new ICICI();
		Bank b3 = new AXIS();
		System.out.println("SBI Rate of Interest: " + b1.getRateOfInterest());
		System.out.println("ICICI Rate of Interest: " + b2.getRateOfInterest());
		System.out.println("AXIS Rate of Interest: " + b3.getRateOfInterest());
	}
}
