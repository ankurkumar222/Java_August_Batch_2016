package StringCompression;

public class Solution {

	public static String compress(String inputString) {
		if(inputString==null){
			return null;
		}
		if(inputString.length()==0){
			return "";
		}
		String output = inputString.charAt(0)+"";
		int count = 1;
		for (int i = 1; i < inputString.length(); i++) {
			if (inputString.charAt(i) == inputString.charAt(i - 1)) {
				count++;
				if (i == inputString.length() - 1) {
					output += count;
				}
			} else {
				if (count > 1) {
					output += count + "" + inputString.charAt(i);
				} else {
					output += inputString.charAt(i);
				}
				count = 1;
			}
		}
		return output;
	}

	public static void main(String[] args) {
		String str = compress("aaabbccds");
		System.out.println(str);

	}

}
