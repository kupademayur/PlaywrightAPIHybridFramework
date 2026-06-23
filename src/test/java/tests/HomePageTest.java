package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.HomePage;

public class HomePageTest extends BaseTest {
	
	@Test
	public void verifyHomePageTitle() {
		
		HomePage homePage = new HomePage(page);
		
		String title = homePage.getPageTitle();
		
		System.out.println("Title: " + title);
		
		Assert.assertTrue(
				title.contains("Automation"),
				"Home page title verification failed");
	}

}
