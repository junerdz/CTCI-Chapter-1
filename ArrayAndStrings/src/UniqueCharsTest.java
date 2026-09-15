import student.TestCase;

/**
 * Test class for AllUniqueChars
 * 
 * @author Juni Bautista
 * @version 2026.09.14
 */
public class UniqueCharsTest extends TestCase {
	
	
	/**
	 * Test for isUniqueChars(String s)
	 */
	public void testIsUniqueChars(){
		
		// Test for word that has duplicate chars
		String s1 = "ferfdon";
		assertFalse(UniqueChars.isUniqueChars(s1));
		
		// Test for word that has no duplicate chars
		String s2 = "fart";
		assertTrue(UniqueChars.isUniqueChars(s2));

	}

}