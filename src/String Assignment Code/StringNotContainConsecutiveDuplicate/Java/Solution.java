package StringNotContainConsecutiveDuplicate;

public class Solution {
	/*
	 * Take a String input from user and return a String that does not contain
	 * consecutive duplicates. For example, for input "aabccbaa" return "abcba".
	 */
	public static String notContainConsecutiveDuplicate(String str) {
		if(str==null){
			return null;//if string is null
		}
		if(str.length()==0){
			return ""; //if empty string
		}
		String resultString = ""+str.charAt(0);
		int i = 1;
		while (i < str.length()) {
			if (str.charAt(i - 1) != str.charAt(i)) {
				resultString = resultString + str.charAt(i);
			}
			i++;
		}
		return resultString;
	}

	public static void main(String[] args) {
String str = notContainConsecutiveDuplicate("aabccbaa");
System.out.println(str);
	}
}
