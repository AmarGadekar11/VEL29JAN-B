package testpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB_new {
	
	public static void main (String[]args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	WebElement user = driver.findElement(By.xpath("//input[@type='text']"));
	user.sendKeys("AMAR1234");
	WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
	password.sendKeys("358358");
	WebElement LogInButton= driver.findElement(By.xpath("//button[text()='Log In']"));
	//LogInButton.click();
	WebElement CreateNewAccount = driver.findElement(By.xpath("//a[text()='Create New Account']"));
	CreateNewAccount.click();
	
	Thread.sleep(3000);
	WebElement FirstName= driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	FirstName.sendKeys("Amar");
	WebElement SurName= driver.findElement(By.xpath("(//input[@type='text'])[3]"));
	SurName.sendKeys("1245");
	
	}
}


