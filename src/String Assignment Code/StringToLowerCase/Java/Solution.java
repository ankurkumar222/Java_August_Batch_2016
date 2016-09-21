package StringToLowerCase;

public class Solution {

	public static String toLowercase(String inputString) {
		String resultString = "";
		for (int i = 0; i < inputString.length(); i++) {
			char currentChar = inputString.charAt(i);
			if (currentChar >= 'A' && currentChar <= 'Z') {
				currentChar = Character.toLowerCase(currentChar);
			}
			resultString = resultString + currentChar;
		}
		return resultString;
	}

	public static void main(String[] args) {
		String str = toLowercase("AbcdEfGD");
		System.out.println(str);
	}

}
