package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class obj_loc {
	
	WebDriver driver = null;	
	By text_box = By.id("lst-ib");
	By search_button = By.name("btnK");
	
	public obj_loc(WebDriver driver) {
		this.driver = driver;
		
	}
	public void enter_text(String text) {
		driver.findElement(text_box).sendKeys(text);
	}
	
	public void click_search() {
		driver.findElement(search_button).submit();
	}
}
