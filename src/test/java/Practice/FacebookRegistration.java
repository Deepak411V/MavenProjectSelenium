package Practice;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistration {

	public static void main(String[] args) throws InterruptedException {
	

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//driver.manage().window().maximize();		
		
	driver.get("https://www.facebook.com");
	
	driver.findElement(By.linkText("Create new account")).click();
	
	
//fill the registration details
	

	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Christy");
	
	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("john");
	
//driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("christy.john123@gmail.com");
	
	String email = generateEmail();
	System.out.println("Email="+email);
	driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys(email);
	
	driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys(email);
	
	driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("christy.123");

//TYPE ::1	
	    //date of birth
	/*	driver.findElement(By.id("day")).sendKeys("10");
		driver.findElement(By.id("month")).sendKeys("oct");
		driver.findElement(By.id("year")).sendKeys("1992");	    */
//TYPE ::2	
		Select Day = new Select(driver.findElement(By.id("day")));
		Day.selectByIndex(9);
		Select Month = new Select(driver.findElement(By.id("month")));
		Month.selectByIndex(9);
		Select Year = new Select(driver.findElement(By.id("year")));
		Year.selectByValue("1992");
//select one value (check box or radio button)
	
	driver.findElement(By.xpath("//label[@class='_58mt']")).click();

//submit	
	driver.findElement(By.name("websubmit")).click();
	
	//driver.quit();
	
	}

	public static String generateEmail() {
		Random r = new Random();
		String s = "";
		for(int i=1;i<8;i++) {
			int x =r.nextInt(97,122);
			s=s+((char)x);
		}
		s=s+"@gmail.com";
		return s;
	}

}


