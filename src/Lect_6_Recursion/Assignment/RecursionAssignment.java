package Lect_6_Recursion.Assignment;

public class RecursionAssignment {

	public static int[] indexesOfSeven(int[] arr, int index) {
		if (index == arr.length) {
			int[] result = new int[0];
			return result;
		}

		int[] smallResult = indexesOfSeven(arr, index + 1);

		if (arr[index] != 7) {
			return smallResult;
		} else {
			int result[] = new int[smallResult.length + 1];
			result[0] = index;
			for (int i = 0; i < smallResult.length; i++) {
				result[i + 1] = smallResult[i];
			}
			return result;
		}

	}

	public static String getKeysName(int number) {
		switch (number) {
		case 1:
			return "";
		case 2:
			return "ABC";
		case 3:
			return "DEF";
		default:
			return "";
		}
	}

	public static int[][] allSubSetOfArray(int[] input, int index) {
		if (index == input.length) {
			int result[][] = { {} };
			return result;
		}

		int[][] smallResult = allSubSetOfArray(input, index + 1);
		int[][] result = new int[smallResult.length * 2][];

		for (int i = 0; i < smallResult.length; i++) {
			int length = smallResult[i].length;
			result[i] = new int[length];
			for (int j = 0; j < length; j++) {
				result[i][j] = smallResult[i][j];
			}
		}
		for (int i = 0; i < smallResult.length; i++) {
			int length = smallResult[i].length;
			result[i + smallResult.length] = new int[length + 1];
			result[i + smallResult.length][0] = input[index];
			for (int j = 0; j < length; j++) {
				result[i + smallResult.length][j + 1] = smallResult[i][j];
			}
		}
		return result;
	}

	public static String[] keyPad(int number) {
		if (number == 0) {
			String[] result = { "" };
			return result;
		}

		String[] smallresult = keyPad(number / 10);
		String keys = getKeysName(number % 10);
		String[] result = new String[smallresult.length * keys.length()];

		int k = 0;
		for (int i = 0; i < smallresult.length; i++) {
			for (int j = 0; j < keys.length(); j++) {
				result[k++] = smallresult[i] + keys.charAt(j);
			}
		}

		return result;

	}

	public static String[] subSequence(String input) {
		if (input.length() == 0) {
			String[] output = {};
			// String[] output1 = new String[1];
			// output1[0] = "";
			return output;
		}

		String[] smallresult = subSequence(input.substring(1));
		String[] result = new String[(smallresult.length) * 2];

		for (int i = 0; i < smallresult.length; i++) {
			result[i] = smallresult[i];
		}
		for (int i = 0; i < smallresult.length; i++) {
			result[i + smallresult.length] = input.charAt(0) + smallresult[i];
		}

		return result;

	}

	public static void permutation(String input, String resultSoFar) {
		if (input.length() == 0) {
			System.out.println(resultSoFar);
			return;
		}

		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			String newResultSoFar = resultSoFar + ch;
			String newInput = input.substring(0, i) + input.substring(i + 1);
			permutation(newInput, newResultSoFar);
		}
	}

	public static void subSequencePrint(String input, String resultSoFar) {
		if (input.length() == 0) {
			System.out.println(resultSoFar);
			return;
		}

		subSequencePrint(input.substring(1), resultSoFar + input.charAt(0));
		subSequencePrint(input.substring(1), resultSoFar);
	}

	public static String[] codes(String str) {
		if (str.length() == 1 || str.length() == 0) {
			if (str.length() == 1) {
				int num = str.charAt(0) - '0';
				char ch = (char) (num + 'a' - 1);
				String[] result = { ch + "" };
				return result;
			} else {
				String[] result = {};
				return result;
			}
		}
		String[] smallResult1 = new String[0];
		String[] smallResult2 = new String[0];

		if (str.charAt(0) >= '1' && str.charAt(0) <= '9' && str.charAt(1) != '0') {
			int num = str.charAt(0) - '0';
			char ch = (char) (num + 'a' - 1);

			smallResult1 = codes(str.substring(1));
			for (int i = 0; i < smallResult1.length; i++) {
				smallResult1[i] = ch + smallResult1[i];
			}
		}
		if (str.charAt(0) == '1' || (str.charAt(0) == '2' && str.charAt(1) >= '1' && str.charAt(1) <= '6')) {
			int num = (str.charAt(0) - '0') * 10 + str.charAt(1) - '0';
			char ch = (char) (num + 'a' - 1);
			smallResult2 = codes(str.substring(2));
			for (int i = 0; i < smallResult2.length; i++) {
				smallResult2[i] = ch + smallResult2[i];
			}
		}
		int k = 0;
		String result[] = new String[smallResult1.length + smallResult2.length];
		for (int i = 0; i < smallResult1.length; i++) {
			result[k++] = smallResult1[i];
		}
		for (int i = 0; i < smallResult2.length; i++) {
			result[k++] = smallResult2[i];
		}
		return result;
	}

	/**
	 * 
	 * Suppose you have a string made up of only the letters 'a' and 'b'. Write
	 * a recursive function that checks if the string was generated using the
	 * following rules - b. the string begins with an 'a' c. each 'a' is
	 * followed by nothing or an 'a' or "bb" d. each "bb" is followed by nothing
	 * or an 'a'
	 */
	int checkstring(String input) {
		if (input == null) {
			return 1;
		}
		if (input.charAt(0) == 'a') {
			if (input.charAt(1) == 'a') {
				return checkstring(input.substring(1));
			} else if (input.charAt(1) == 'b') {
				return checkstring(input.substring(1));
			}
			if (input.length() == 0) {
				return 1;
			} else {
				return 0;
			}
		} else if (input.charAt(0) == 'b') {
			if (input.charAt(1) == 'b' && input.charAt(2) == 'a') {
				return checkstring(input.substring(2));
			} else if (input.charAt(1) == 'b' && input.length() == 1) {
				return 1;
			} else {
				return 0;
			}
		}
		return -1;
	}

	/**
	 * Q_10 A child is running up a staircase with n steps, and can hop either 1
	 * step, 2 steps or 3 steps at a time. Implement a method to count how many
	 * possible ways the child can run up to the stairs.
	 */

	public int possibleWays(int n) {
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		return possibleWays(n - 1) + possibleWays(n - 2) + possibleWays(n - 3);
	}

	public static void main(String[] args) {
		// int[] arr = { 2, 7, 8, 3, 1, 7, 7, 7, 4 };
		// int[] result = indexesOfSeven(arr, 0);
		// for (int value : result) {
		// System.out.println(value);
		// }

		// String[] result = keyPad(23);
		// for (String str : result) {
		// System.out.println(str);
		// }
		// int arr []= {2,3,4};
		//
		//
		// int result1[][]=allSubSetOfArray(arr, 0);
		//
		// for(int i = 0;i<result1.length;i++){
		// int length = result1[i].length;
		// for(int j = 0;j<length;j++){
		// System.out.print(result1[i][j]+" ");
		// }
		// System.out.println();
		// }

		// subSequencePrint("abc","");
		permutation("abc", "");

	}
}
