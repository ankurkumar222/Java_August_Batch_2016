package cn.oops.objectandclass.examples.example_3;

class Box {
	double width;
	double height;
	double depth;
	double volume = width*height*depth;

	void volume() {
		System.out.print("Volume is ");
		System.out.println(width * height * depth);
	}
}