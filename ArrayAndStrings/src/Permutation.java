import java.util.*;

/**
 * Chapter 1 Arrays and Strings | Question 1.3
 * 
 * Given two strings, write a method to decide if one
 * is a permutation of the other.
 */



/**
 * This class will determine whether one String
 * is a permutation of another String.
 * 
 * @author Juni Bautista
 * 
 * @version 2026.09.16
 */
public class Permutation {

	/**
	 * Determine if a String is a permutation of another String.
	 * 
	 * @param s1
	 * 		String to be compared
	 * @param s2
	 * 		String to be compared
	 * @return boolean
	 * 		Represents whether Strings are permutations of each other
	 */
	public static boolean isPermutation(String s1, String s2) {
		if(s1.length() != s2.length()) {
			return false;
		}
		else {	
			
			HashMap<Character, Integer> s1Hash = new HashMap<>();
			for(int i = 0; i < s1.length(); i++) {
				// Check if HashMap already contains Char
				// If so, ++1 to Value Counter
				if(s1Hash.containsKey(s1.charAt(i))) {
					s1Hash.replace(s1.charAt(i), s1Hash.get(s1.charAt(i)) + 1);
				}
				else
					s1Hash.put(s1.charAt(i), 1);
			}
			
			HashMap<Character, Integer> s2Hash = new HashMap<>();
			for(int j = 0; j < s2.length(); j++) {
				if(s2Hash.containsKey(s2.charAt(j))) {
					s2Hash.replace(s2.charAt(j), s2Hash.get(s2.charAt(j)) + 1);
				}
				else
					s2Hash.put(s2.charAt(j), 1);
			}
			
			return s1Hash.equals(s2Hash);
		}
		
	}
}
