package ReverseStringWordwise;

/*
 * Reverse String word wise. 
 * Eg “Welcome to Coding Ninjas” reversed is – “Ninajs Coding to Welcome”
 * */
public class Solution {

	public static String reverseWordWise(String input) {
		int end = input.length();
		int i = input.length() - 1;
		String output = "";
		while (i >= 0) {
			if (input.charAt(i) == ' ') {
				output = output + input.substring(i + 1, end) + " ";
				end = i;
			}
			i--;
		}
		output += input.substring(i + 1, end);
		return output;
	}

	public static void main(String[] args) {
		String str = reverseWordWise("hi hello ankur");
		System.out.println(str);
	}
}
