package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogoAvailableOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
	boolean logo = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[1]/div/img")).isDisplayed();


	if (logo==true) 
	{
	System.out.println("logo is available");
	}
	else 
	{
		System.out.println("logo is not available");
	}
	}

}	