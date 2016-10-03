package cn.oops.objectandclass;

import java.util.Scanner;

public class Student {

	String name;
	int rollNumber;
	int age;
	
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name= "Anchal";
		s1.rollNumber = 32;
		s1.age= 20;
	
		
		Student s2 = new Student();
		s2.name= "Inder";
		s2.rollNumber = 12;
		s2.age= 30;
		
		
		Student[] arr = new Student[10];
		Scanner s= new Scanner(System.in);
		for(int i =0 ;i<3;i++){
			arr[i] = new Student();
			System.out.println("Enter age");
			arr[i].age = s.nextInt();
			System.out.println("Enter Name");
			arr[i].name = s.next();
			System.out.println("Enter Roll Number");
			arr[i].rollNumber = s.nextInt();
			System.out.println(arr[i].age+"   "+arr[i].name+"   "+arr[i].rollNumber);
		}
		
		for(int i =0;i<3;i++){
			System.out.println(arr[i].age+"   "+arr[i].name+"   "+arr[i].rollNumber);
		}
	}
}














