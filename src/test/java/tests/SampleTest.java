package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTest {
	
	@Test
	public void sampleTest() {
		System.out.println("Framework setup Successfull");
		
		Assert.assertTrue(true);
	}

}
