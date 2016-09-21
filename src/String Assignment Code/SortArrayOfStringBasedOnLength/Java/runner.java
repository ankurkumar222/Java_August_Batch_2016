package SortArrayOfStringBasedOnLength;

import java.util.Scanner;

public class runner {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		
		String[] result=Solution.sortArrayOfString(input.split(" "));
		for(String str:result){
			System.out.println(str);
		}
	}
}
