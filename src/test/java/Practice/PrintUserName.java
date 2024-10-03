package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintUserName {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.id("email")).sendKeys("Christy");
		Thread.sleep(1000);
		driver.findElement(By.id("pass")).sendKeys("D@123");
		Thread.sleep(1000);
		
		String s = driver.findElement(By.id("email")).getAttribute("value");
		String s1 = driver.findElement(By.id("pass")).getAttribute("value");
		System.out.println(s);
		System.out.println(s1);
	
	
	
	}

}
