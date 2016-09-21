package RotateStringByNCharacter;

public class Solution {

	public static String rotateString(String inputString, int n){
		if(inputString==null){
			return null;
		}
		if(inputString.length()==0){
			return "";
		}
		String resultString = inputString.substring(0, inputString.length()-n);
		int i = 0;
		while(i<n){
			resultString = inputString.charAt(inputString.length()-1-i)+resultString;
			i++;
		}
		
		
		return resultString;
	}
	
	public static void main(String[] args) {
		String str = rotateString("abcdefgh", 2);
		System.out.println(str);
	}
}
