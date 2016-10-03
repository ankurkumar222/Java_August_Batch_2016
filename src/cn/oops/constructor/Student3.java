package cn.oops.constructor;

public class Student3 {
	int id;
	String name;

	
	Student3(int x){
		id = x;
	}
	void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String args[]) {
		Student3 s1 = new Student3(10);
		Student3 s2 = new Student3(3);
		
		s1.display();
		s2.display();
	}
}