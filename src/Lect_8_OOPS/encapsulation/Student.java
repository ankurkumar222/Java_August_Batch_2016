package Lect_8_OOPS.encapsulation;

public class Student {

	private int age;

	int getAge() {
		return age;
	}

	void setAge(int age) {
		if (age > 18) {
			this.age = age;
		}
	}
}
