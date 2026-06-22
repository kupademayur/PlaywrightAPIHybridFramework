package tests;

import org.testng.annotations.Test;

import com.microsoft.playwright.Page;

import base.BaseTest;

public class BrowserLaunchTest extends BaseTest {
	
	@Test
	public void launchApplication() {
		
		page.navigate(
				 "https://automationexercise.com");
		
		System.out.println(page.title());
	}

}
