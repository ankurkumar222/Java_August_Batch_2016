package cn.oops.objectandclass.examples.example_5;

class Box {
	double width;
	double height;
	double depth;
	double volume;

	Box() {
		System.out.println("Constructing Box");
		width = 10;
		height = 10;
		depth = 10;
		volume = 0;
	}

	
	double volume() {
		return width * height * depth;
	}
}