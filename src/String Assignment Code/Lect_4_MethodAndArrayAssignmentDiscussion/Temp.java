package Lect_4_MethodAndArrayAssignmentDiscussion;

import java.util.Scanner;



public class Temp {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String word = s.next();

		for (int i = 0; i < word.length(); i++) {
			System.out.println(word.charAt(i));
		}
	}
}
