package testci;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProjectHelperTest {

	@Test
	public void testMyConcat() {
		assertEquals(ProjectHelper.myConcat("a", "b"),"a my b");
		
	}

}
