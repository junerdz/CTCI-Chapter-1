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
		
	    // Test for Empty Str
	    String empStr = "";
	    assertTrue(UniqueChars.isUniqueChars(empStr));
	    
		// Test for word that has duplicate chars
		String s1 = "fiefdom";
		assertFalse(UniqueChars.isUniqueChars(s1));
		
		// Test for word that has no duplicate chars
		String s2 = "serfdom";
		assertTrue(UniqueChars.isUniqueChars(s2));

	}

}