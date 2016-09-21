package AnagramString.Java;
/*
 * Given two strings check if they are permutations of each other.
 * */
public class Solution {
	public static boolean isAnagram(String input1, String input2) {
		if (input1.length() != input2.length()) {
			return false;
		}

		for (int i = 0; i < input1.length(); i++) {
			char currentCharacter = input1.charAt(i);
			int indexCurrentChar = input2.indexOf(currentCharacter);
			if (indexCurrentChar != -1) {
				input2 = input2.substring(0, indexCurrentChar) + input2.substring(indexCurrentChar + 1, input2.length());
			} else {
				return false;
			}
		}

		if (input2.isEmpty()) {
			return true;
		}
		return false; 
	}

	public static void main(String[] args) {
		boolean x = isAnagram("abcd", "bdua");
		System.out.println(x);
	}
}
