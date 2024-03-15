package PlaywrightWithJava;

import com.microsoft.playwright.*;
import com.microsoft.playwright.BrowserType.LaunchOptions;

public class AppTest 
{
	public static void main(String[] args) {
		try (Playwright playwright = Playwright.create()) //It will start playwright server which is in nodejs
		{
			LaunchOptions lp = new LaunchOptions();
			lp.setChannel("chrome");
			lp.setHeadless(false);
			Browser browser = playwright.chromium().launch(lp); //it will launch the browser
			Page page = browser.newPage(); //
			page.navigate("http://Google.com");
			System.out.println(page.title());
			
			browser.close(); //close browser
			playwright.close(); //close server
		}
	}
}
