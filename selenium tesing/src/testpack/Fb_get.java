package testpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fb_get {
	public class NewFB {
		public static void main (String[]args) throws InterruptedException
		{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement user = driver.findElement(By.xpath("//input[@type='text']"));
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		WebElement LogInButton= driver.findElement(By.xpath("//button[text()='Log In']"));
		WebElement CreateNewAccount = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		
		//to get the text present on web element
		
		String text = LogInButton.getText();
		System.out.println(text);
		
		boolean result = text.equals("LogIn");
		if (result)
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
}
	}
}