package testpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main (String[]args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\OneDrive\\Documents\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/login/");
	driver.manage().window().maximize();
	
	WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
	username.sendKeys("gadekaramar@ymail.com");
	WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
	password.sendKeys("savitaindr");
	WebElement loginButton = driver.findElement(By.xpath("//button[text()='Log In']"));
	loginButton.click();
	
	
	
	}
}