package tests;

import org.testng.annotations.Test;


import base.BaseTest;
import utils.ScreenshotUtil;

public class ScreenshotTest extends BaseTest {
	
	@Test
	public void captureScreenshotTest() {
		
		page.navigate("https://automationexercise.com");
		
		ScreenshotUtil.captureScreenshot(
				page,
				"HomePage");
	}

}
