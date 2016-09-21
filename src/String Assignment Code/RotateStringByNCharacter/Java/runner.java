package RotateStringByNCharacter;

import java.util.Scanner;

public class runner {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		int n = s.nextInt();
		System.out.println(Solution.rotateString(input,n));
	}
}
