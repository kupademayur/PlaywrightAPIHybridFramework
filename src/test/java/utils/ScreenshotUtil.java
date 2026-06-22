package utils;

import java.nio.file.Paths;

import com.microsoft.playwright.Page;

public class ScreenshotUtil {
	
	public static void captureScreenshot(Page page, String fileName) {
		
		page.screenshot(
				new Page.ScreenshotOptions()
				.setPath(Paths.get(
						"screenshots/" + fileName + ".png"))
				.setFullPage(true));
	}

}
