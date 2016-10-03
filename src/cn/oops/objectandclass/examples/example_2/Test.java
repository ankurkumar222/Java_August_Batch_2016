package cn.oops.objectandclass.examples.example_2;

import java.util.Scanner;

public class Test {
	public static void main(String args[]) {
		/*Box mybox1 = new Box();
		Box mybox2 = new Box();
		double vol;
		
		
		mybox1.width = 10;
		mybox1.height = 20;
		mybox1.depth = 15;
		
		
		mybox2.width = 3;
		mybox2.height = 6;
		mybox2.depth = 9;
		
		
		vol = mybox1.width * mybox1.height * mybox1.depth;
		System.out.println("Volume is " + vol);
		
		
		vol = mybox2.width * mybox2.height * mybox2.depth;
		System.out.println("Volume is " + vol);
		*/
		Scanner s = new Scanner(System.in);
		
		Box[] boxArray = new Box[5];
		for(int i=0;i< 5;i++){
		int no = s.nextInt();
			//boxArray[i] = new Box();
			boxArray[i].depth = no;
			boxArray[i].height = no;
			boxArray[i].width = no;
		}
		
		
		for(int i=0;i<boxArray.length;i++){
			System.out.println(boxArray[i].depth +" "+ boxArray[i].height+""+boxArray[i].width);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}