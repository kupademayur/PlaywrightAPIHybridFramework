package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.HomePage;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;


@Epic("UI Automation")
@Feature("Home Page Validation")
public class HomePageTest extends BaseTest {
	
	@Test
	@Description("Verify Automation Exercise home page title")
	@Severity(SeverityLevel.CRITICAL)
	public void verifyHomePageTitle() {
		
		HomePage homePage = new HomePage(page);
		
		String title = homePage.getPageTitle();
		
		System.out.println("Title: " + title);
		
		Assert.assertTrue(
				title.contains("Automation"),
				"Home page title verification failed");
	}

}
