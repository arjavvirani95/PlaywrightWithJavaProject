package PlaywrightWithJava;

import com.microsoft.playwright.*;

public class AppTest 
{
	public static void main(String[] args) {
		try (Playwright playwright = Playwright.create()) //It will start playwright server which is in nodejs
		{
			Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false)); //it will launch the browser
			Page page = browser.newPage(); //
			page.navigate("http://Google.com");
			System.out.println(page.title());
			
			browser.close(); //close browser
			playwright.close(); //close server
		}
	}
}
