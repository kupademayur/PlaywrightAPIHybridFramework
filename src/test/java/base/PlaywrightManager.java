package base;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class PlaywrightManager {
	
	private static Playwright playwright;
	private static Browser browser;
	private static BrowserContext context;
	private static Page page;
	
	public static Page getPage(String browserName,
								boolean headless) {
		
		playwright = Playwright.create();
		
		switch(browserName.toLowerCase()) {
		
		case "firefox":
			
			browser = 
					playwright.firefox()
					.launch(new BrowserType
							.LaunchOptions()
							.setHeadless(headless));
			
			break;
			
		case "webkit":
			
			browser =
					playwright.webkit()
					.launch(new BrowserType
							.LaunchOptions()
							.setHeadless(headless));
					
					break;
			
			default:
				
				browser = 
						playwright.chromium()
						.launch(new BrowserType
								.LaunchOptions()
								.setHeadless(headless));		
		}
		
		context = browser.newContext();
		
		page = context.newPage();
		
		return page;
	}
	
	public static void closeBrowser() {
		
		if(context != null)
			context.close();
		
		if(browser != null)
			browser.close();
		
		if(playwright != null)
			playwright.close();
	}

}
