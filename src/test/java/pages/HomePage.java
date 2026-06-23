package pages;

import com.microsoft.playwright.Page;

public class HomePage {
	
	private Page page;
	
	public HomePage(Page page) {
		this.page = page;
	}
	
	public String getPageTitle() {
		return page.title();
	}

}
