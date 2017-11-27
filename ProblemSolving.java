/**
 * 
 * @author nadya.ilinskaya
 * 
 * 
 *1. Given a list of numbers, find the longest subsequence of consecutive positive integers.  
	E.g. given [1,5,1,-1,1] return [1,5,1].  
	Given [1,5,1,-1,1,1,1,1] return [1,1,1,1]

2. Write a function to check if the given STRING is a palindrome or not.
	A palindrome is a word, phrase, number, or other sequence of characters which 	
	reads the same backward as forward
	e.g. “civic” is a palindrome, “toyota” is not 

3. Write a function that checks whether an INTEGER ARRAY is a palindrome or not.

4. Find duplicate characters in a String and count the number of occurrences of the duplicate characters

5. Remove duplicate characters in a string: Given a string "banana", return unique string "ban"

6. Given two strings "parachute" and "raphtueac", determine if 2 strings are anagrams of each other (both the strings have same set of characters)


 */
import java.lang.reflect.Array;
import java.util.*;

public class ProblemSolving {
	
	// 1
	public static int[] LongestPositiveSubsequence(int[] arr) {
		
		int start = 0, end = 0, length = 0;
		int start2 = 0, end2 = 0;
		
		int i = 0;
		
		while(i < arr.length) {
			if(arr[i] >= 0) {
				
			}
			else {// arr[i] < 0
				
			}
			
			i++;
		}
		
		return null;
	}
	
	// 2
	public static boolean isPalindrome(String str) {
		
		int start = 0, end = str.length() - 1;
		while(start < end) {
			if(str.charAt(start) != str.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}
		
		return true;
	}
	public static void testIsPalindrome(String str) {
		if(isPalindrome(str)) {
			System.out.println(str + " is palindrome");
		}
		else {
			System.out.println(str + " is not palindrome");
		}
	}
	
	// 3
	
	// 4
	public static Map<Character, Integer> findDuplicates(String str){
		
		Map<Character, Integer> hist = new HashMap<Character, Integer>();
		
		for(int i = 0; i < str.length(); i++) {
			Character key = str.charAt(i);
			
			if(hist.containsKey(key)) {
				Integer value = hist.get(key);
				hist.put(key, value + 1);
			}
			else {
				hist.put(key, 1);
			}
		}
				
		return hist;
	}
	public static void testFindDuplicates(String str) {
		Map<Character, Integer> hist = findDuplicates(str);
		
		for(Character key : hist.keySet()) {
			Integer value = hist.get(key);
			if(value > 1) {
				System.out.printf("duplicate: '%s' => %d\n", key, value);
			}
		}
	}

	// 5
	public static String removeDuplicates(String str) {
		StringBuffer sb = new StringBuffer();
		Map<Character, Integer> hist = new HashMap<Character, Integer>();
		
		for(int i = 0; i < str.length(); i++) {
			Character key = str.charAt(i);
			
			if(!hist.containsKey(key)) {
				hist.put(key, 1);
				sb.append(key);
			}
		}
		
		
		return sb.toString();
	}
	public static void testRemoveDuplicates(String str) {
		String str2 = removeDuplicates(str);
		System.out.printf("Deduplicated: '%s' => '%s'\n", str, str2);
	}
	
	// 6
	public static String sortCharacters(String str) {		
		char[] chars = str.toCharArray();
		Arrays.sort(chars);
		return new String(chars);
		
	}
	public static boolean areAnagrams(String str1, String str2) {
		
		if(str1.length() != str2.length()) {
			return false;
		}
		
		String s1 = sortCharacters(str1);
		String s2 = sortCharacters(str2);
		
		for(int i = 0; i < s1.length(); i++) {
			if(s1.charAt(i) != s2.charAt(i)) {
				return false;
			}
		}

		return true;
	}
	public static void testAreAnagrams(String str1, String str2) {
		if(areAnagrams(str1, str2)) {
			System.out.printf("Strings: '%s' and '%s' are anagrams\n", str1, str2);
		}
		else {
			System.out.printf("Strings: '%s' and '%s' are not anagrams\n", str1, str2);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 2
		System.out.println();
		testIsPalindrome("civic");
		testIsPalindrome("abccba");
		testIsPalindrome("abcdba");
		
		// 4
		System.out.println();
		testFindDuplicates("characters");
		
		// 5
		System.out.println();
		testRemoveDuplicates("banana");
		
		// 6
		System.out.println();
		testAreAnagrams("abcd", "cadb");
		testAreAnagrams("abc", "abd");
	}

}
