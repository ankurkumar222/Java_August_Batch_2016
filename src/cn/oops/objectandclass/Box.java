package cn.oops.objectandclass;

public class Box {
	int height;
	int depth;
	int width;
	

	Box(){
		width = 3;
		depth = 4;
		height = 5;
	}
	Box(int w, int h, int d){
		width = w;
		depth = d;
		height = h;
	}
	
	Box(int w, int d){
		width = w;
		depth = d;
		width =0;
	}
	
	int volume(){
		return height*depth*width;
	}
	

	
	
}
