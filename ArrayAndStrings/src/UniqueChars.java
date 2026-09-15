import java.util.*;

/**
 * Chapter 1 Arrays and Strings | Question 1.1
 * 
 * Implement an algorithm to determine if a string has all 
 * unique characters. What if you cannot use additional data structures?
 */



/**
 * This class will determine whether a String has all
 * Unique characters.
 * 
 * @author Juni Bautista
 * 
 * @version 2026.09.14
 */
public class UniqueChars {

	/**
	 * Determines if a String has all unique chars
	 * 
	 * @param String
	 * 		String to be analyzed
	 * @return boolean
	 * 		Represents whether String has all unique characters.
	 */
	public static boolean isUniqueChars(String s) {
		HashMap<Character, Integer> strCtr = new HashMap<>();
		for(int i = 0; i < s.length(); i++) {
			if(strCtr.containsKey(s.charAt(i))) {
				return false;
			}
			else {
				strCtr.put(s.charAt(i), 0);
			}
		}
		return true;
	}
}