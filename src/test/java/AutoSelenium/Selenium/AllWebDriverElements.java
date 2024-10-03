package AutoSelenium.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllWebDriverElements {

	public static void main(String[] args) throws InterruptedException//throws InterruptedException
	{
		// TODO Auto-generated method stub
		
//open the browser
		WebDriver driver= new ChromeDriver();
		
//enter url
driver.get("https://www.google.com/");

//to get the title of current web page
String title = driver.getTitle();
System.out.println("Title:"+title);

//to get the URLof current web page
String url=driver.getCurrentUrl();
System.out.println("URL:"+url);

//To close the browser
//Thread.sleep(2000);
//driver.close();

	}

}
