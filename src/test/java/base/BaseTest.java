package base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.microsoft.playwright.Page;

import utils.ConfigReader;

public class BaseTest {
	
	protected Page page;
	
	@BeforeMethod
	public void setup() {
		
		page = PlaywrightManager.getPage(
				ConfigReader.getProperty("browser"),
				Boolean.parseBoolean(
						ConfigReader.getProperty("headless")));
	}
	
	@AfterMethod
	public void tearDown() {
		
		PlaywrightManager.closeBrowser();
	}

}
