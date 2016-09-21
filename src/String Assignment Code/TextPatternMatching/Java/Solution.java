package TextPatternMatching;

/*
 * Given two strings S and T, write a function to find if T is present inside S. If found, return the starting position.
 * For eg. Input : S - “WelcomeBack” and T - “come”
 * Output : 3
 * 
 * 
 * */
public class Solution {
	public static int brute(String text, String pattern) {
		int n = text.length(); // n is length of text.
		int m = pattern.length(); // m is length of pattern
		int j;
		for (int i = 0; i <= (n - m); i++) {
			j = 0;
			while ((j < m) && (text.charAt(i + j) == pattern.charAt(j))) {
				j++;
			}
			if (j == m)
				return i; // match at i
		}
		return -1; // no match
	}
}
