package base;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class PlaywrightManager {
	
	private static ThreadLocal<Playwright> playwright =
			new ThreadLocal<>();
	
	private static ThreadLocal<Browser> browser =
			new ThreadLocal<>();
	
	private static ThreadLocal<BrowserContext> context =
			new ThreadLocal<>();
	
	private static ThreadLocal<Page> page =
			new ThreadLocal<>();
	
	public static Page getPage(String browserName,
								boolean headless) {
		
		playwright.set(Playwright.create());
		
		switch(browserName.toLowerCase()) {
		
		case "firefox":
			
			browser.set(
					playwright.get()
					.firefox()
					.launch(new BrowserType.LaunchOptions()
							.setHeadless(headless)));
			
			break;
			
		case "webkit":
			
			browser.set(
					playwright.get()
					.webkit()
					.launch(new BrowserType.LaunchOptions()
							.setHeadless(headless)));
					
					break;
			
			default:
				
				browser.set(
						playwright.get()
						.chromium()
						.launch(new BrowserType.LaunchOptions()
								.setHeadless(headless)));		
		}
		
		context.set(browser.get().newContext());

        page.set(context.get().newPage());

        return page.get();
	}
	
	public static Page getCurrentPage() {
        return page.get();
	}
	
	public static void closeBrowser() {

        if (context.get() != null)
            context.get().close();

        if (browser.get() != null)
            browser.get().close();

        if (playwright.get() != null)
            playwright.get().close();
	}

}
