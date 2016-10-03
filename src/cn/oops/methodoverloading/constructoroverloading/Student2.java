package cn.oops.methodoverloading.constructoroverloading;

//Constructor Overloading

public class Student2 {
	Integer id ;
	String name;
	int age;

	public Student2(int a, String n) {
		id = a;
		name = n;
	}
	
	public Student2(int a, String n, int age){
		id = a;
		name = n;
		this.age = age;
	}

	void display() {
		System.out.println(id + " " + name + " " + age);
	}
	
	public static void main(String[] args) {
		Student2 s1 = new Student2(15, "Amit");
		s1.display();
		
		Student2 s2 = new Student2(17, "Sumit", 33);
		s2.display();
	}

}
