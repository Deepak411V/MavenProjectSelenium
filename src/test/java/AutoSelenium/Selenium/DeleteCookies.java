package AutoSelenium.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteCookies {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		//open the browser
		WebDriver driver = new ChromeDriver();
	Thread.sleep(2000);
	
	//to delete cookies
	driver.manage().deleteAllCookies();
	
	//to set the size of the window
	org.openqa.selenium.Dimension d =new org.openqa.selenium.Dimension(500,500);
	driver.manage().window().setSize(d);
	Thread.sleep(2000);
	
	//to set the poaaition of window
	//Point p = new Point(250,250);
	driver.manage().window().maximize();
	
	}

}
