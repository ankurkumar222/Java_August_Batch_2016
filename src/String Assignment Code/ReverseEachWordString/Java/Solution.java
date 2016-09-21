package ReverseEachWordString;

/*
 * Reverse each word of a String. 
 * Eg “Welcome to Coding Ninjas” reversed is – “emocleW ot gnidoC sajniN”
 * */
public class Solution {

	public static String reverseEachWord(String input) {
		String output = "";
		int index = 0;

		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == ' ') {
				index = i + 1;
				output += input.charAt(i);
			} else {
				output = output.substring(0, index) + input.charAt(i) + output.substring(index);
			}
		}
		return output;
	}

	public static void main(String[] args) {
		String str = reverseEachWord("Hi this is Ankur ji");
		System.out.println(str);
	}
}
