package AutoSelenium.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test001 {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();

		driver.get("www.google.com");
		
	}

}
