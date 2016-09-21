package TextPatternMatching;

import java.util.Scanner;

public class runner {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String text = s.nextLine();
		String pattern = s.nextLine();
		System.out.println(Solution.brute(text, pattern));
	}
}
