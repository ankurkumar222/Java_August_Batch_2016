package HighestOccuringCharacter.Java;

// highest occurring character in the String.
public class Solution {

	public static char highestOccuringCharacter(String inputString) {
		int charArray[] = new int[256];
		for (int i = 0; i < inputString.length(); i++) {
			charArray[inputString.charAt(i)]++;
			
		}
		char maxOccuringChar =Character.MIN_VALUE; 
		int maxNoOfOccuring = 0;
		for(int i = 0;i<charArray.length;i++) {
			if(charArray[i]>maxNoOfOccuring){
				maxNoOfOccuring++;
				maxOccuringChar = (char)i;
			}
		}
		
		return maxOccuringChar;
	}

	public static void main(String[] args) {
	char ch = highestOccuringCharacter("I love my indnnia")	;
	System.out.println(ch);
	}
}
