package cn.oops.statickeyword;

/*
 * Program of static variable 
 * */

public class Student2 {
	String nameStudent;
	int rollNoStudent;
	static String collegeName = "BVCOE";

	public Student2() {
		System.out.println("Inside Constructor");
	}

	public void fillDetail(int rollNo, String name) {
		nameStudent = name;
		rollNoStudent = rollNo;
	}

	private void display() {
		System.out.println("Name: " + nameStudent + " Roll No: "+rollNoStudent + "College Name" + collegeName);
	}

	public static void main(String[] args) {
		Student2 s = new Student2();
		s.fillDetail(2, "Aman");
		s.display();

		Student2 s2 = new Student2();
		s2.fillDetail(3, "Amit");
		s2.display();
		s.collegeName ="USIT";
		
		s.display();
		s2.display();
		
	}

}