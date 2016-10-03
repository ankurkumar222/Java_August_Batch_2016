package cn.oops.encapsulation;

public class Student {
	private String name;

	public String getName() {
		return name;
	}

	/*public void setName(String name) {
		if (name.length() < 10)
			this.name = name;
		else{
			System.out.println("Length greater");
		}
	}*/
}

class A
{
	public static void main(String[] args) {
		Student s = new Student();
		s.setName("wdhqwkdhqhdllhfl");
	}
}