package AutoSelenium.Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailAccount {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.gmail.com");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("identifierId")).sendKeys("deepak.v@gmail.com");
		/*String email =new generateEmai();
		System.out.println("Email="+email);
		driver.findElement(By.) */
		
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
		
	
			
		
		
		
	}

}
