package testpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {
	public static void main (String[]args) 
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.gmail.com/");
	driver.manage().window().maximize();
	
	WebElement user2 = driver.findElement(By.xpath("//input[@type='email']"));
	user2.sendKeys("gadekaramar11@gmail.com");
	
	
	}
}
