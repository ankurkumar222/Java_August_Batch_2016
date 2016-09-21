package SortArrayOfStringBasedOnLength;

/*
 * Q_3: Sort an array of Strings based on length.
 * */
public class Solution {

	// using bubble sort
	public static String[] sortArrayOfString(String[] arrOfString) {
		for (int i = 0; i < arrOfString.length; i++) {
			for (int j = 0; j < arrOfString.length - i - 1; j++) {
				if (arrOfString[j].length() > arrOfString[j + 1].length()) {
					String temp = arrOfString[j];
					arrOfString[j] = arrOfString[j + 1];
					arrOfString[j + 1] = temp;
				}
			}
		}
		return arrOfString;
	}

	public static void main(String[] args) {
		String[] arr = { "abc", "p", "yu", "ghjgjh", "ah", "a" };
		sortArrayOfString(arr);
		for (String name : arr) {
			System.out.println(name);
		}
	}
}
