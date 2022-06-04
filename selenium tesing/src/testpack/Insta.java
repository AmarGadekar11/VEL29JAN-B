package testpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Insta {
	public static void main (String[]args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.instagram.com/");
	driver.manage().window().maximize();
	Thread.sleep(1000);
	WebElement Username = driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']"));
	WebElement Password = driver.findElement(By.xpath("(//input[contains(@autocorrect,'off')])[2]"));
	WebElement Signup = driver.findElement(By.xpath("//span[text()='Sign up']"));
	WebElement logInfb = driver.findElement(By.xpath("//span[@class='KPnG0']"));
	Username.sendKeys("AIGADEKAR");
	Password.sendKeys("9561985025");
	Signup.click();
	logInfb.click();
	WebElement emailId = driver.findElement(By.xpath("//input[@type='text']"));
	WebElement passFb = driver.findElement(By.xpath("//input[@type='password']"));
	emailId.sendKeys("gadekaramar@ymail.com");
	passFb.sendKeys("savitaindr");
	WebElement logIn = driver.findElement(By.xpath("//button[text()='Log In']"));
	logIn.click();
     
	}
}
