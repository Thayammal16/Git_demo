package webpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import locators.obj_loc;

public class testcase_search {
	private static WebDriver driver = null;
	
	public static void main(String[] args) {
	googlesearch();
		
	}

	public static void googlesearch() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		
		obj_loc obj = new obj_loc(driver);
		driver.get("https://www.google.com/");
		obj.enter_text("search");
		obj.click_search();
		driver.close();
	}
}
