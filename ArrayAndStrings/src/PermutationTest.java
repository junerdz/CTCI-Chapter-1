import student.TestCase;


/**
 * Test class for Permutation
 * 
 * @author Juni Bautista
 * @version 2026.09.14
 */
public class PermutationTest extends TestCase {

	
	/**
	 * Test for isPermutation()
	 */
	public void testIsPermutation() {
		
		
		
		// Test for invalid Permutation of the same length
		String invStr1 = "Cake";
		String invStr2 = "Dubb";
		assertFalse(Permutation.isPermutation(invStr1, invStr2));
		
		// Test for invalid Permutation of diff lengths
		String diffLen1 = "car";
		String diffLen2 = "carr";
		assertFalse(Permutation.isPermutation(diffLen1, diffLen2));
		
		
		// Test for valid Permutation
		String valStr1 = "butt";
		String valStr2 = "ttub";
		assertTrue(Permutation.isPermutation(valStr1, valStr2));
		
	}
}
