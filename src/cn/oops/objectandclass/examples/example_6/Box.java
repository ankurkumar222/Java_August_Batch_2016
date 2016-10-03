package cn.oops.objectandclass.examples.example_6;

class Box {
	double width;
	double height;
	double depth;

	Box(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}

	
	double volume() {
		return width * height * depth;
	}
}