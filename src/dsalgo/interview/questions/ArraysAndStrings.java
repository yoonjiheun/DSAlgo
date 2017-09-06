package dsalgo.interview.questions;

public class ArraysAndStrings {
	public static void main(String[] args) {
//		String helloWorld = "Mr. John Smith Junior The Third";
//		char[] helloWorldChar = new char[
//		                                 helloWorld.length() +
//		                                 ( getSpaces(helloWorld.toCharArray()) * 2)
//		                                 ];
//		for(int i=0;i<helloWorld.length();i++)  {
//			helloWorldChar[i] = helloWorld.charAt(i);
//		}
//		removeSpaces(helloWorldChar, helloWorld.length());
//		System.out.println(helloWorldChar);

		
	}
	
	
	// QUESTION: Create a method where a string is input and it's permutation can be a palindrome.
	static boolean isPalindromePermutation(String s) {
		//ASCII assumption
		int[] map = new int[128];
		for(int i=0;i<s.length();i++) {
			map[s.charAt(i)]++;
		}
		
		int remainder = 0;
		for(int i=0;i<map.length;i++) {
			remainder += map[i] % 2;
		}
		System.out.println(remainder);
		return remainder <= 1;
	}
	
	// This method removes spaces from a String (represented in a char[]) and adds %20 to "URLify" the string.
	// Takes in a String as a char[] and the true length of the string. True length means that any spaces after the last char will be ignored
	// QUESTION: Create a method that will replace spaces in a string with %20. If implemented in java use a char[] instead.
	// You can assume that there are additional spaces to allow for the replacement of spaces.
	static void removeSpaces(char[] string, int trueLength) {
		int spaces = getSpaces(string);
		
		int index = trueLength + (spaces * 2);
		
		for(int i = trueLength-1; i>=0; i--) {
			if(string[i] == ' ') {
				string[index - 1] = '0';
				string[index - 2] = '2';
				string[index - 3] = '%';
				index = index - 3;
			} else {
				string[index - 1] = string[i];
				index--;
			}
		}
	}
	
	static int getSpaces(char[] string) {
		int spaces = 0;
		for(int i=0;i<string.length;i++) {
			if(string[i] == ' ') spaces++;
			
		}
		
		return spaces;
	}
	
	// QUESTION: Checks whether or not a String s and String t are permutations of each other.
	static boolean isPermutation(String s, String t) {
		
		if(s.length() != t.length()) return false;
		
		// ASCII EXTENDED ASSUMPTION
		int[] characters = new int[256];
		
		for(int i=0; i<s.length();i++) {
			char c = s.charAt(i);
			characters[c]++;
		}
		
		for(int i=0; i<t.length();i++) {
			char c = t.charAt(i);
			characters[c]--;
			
			if(characters[c] < 0) return false;
		}
		return true;
	}
}
