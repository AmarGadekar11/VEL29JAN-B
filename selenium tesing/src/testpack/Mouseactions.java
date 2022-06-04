package testpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseactions {
	public static void main (String[]args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	
	Actions act = new Actions(driver);
	
	// how to perform mouse action on browser
	WebElement acc = driver.findElement(By.xpath("//span[text()='Account & Lists']"));
	
	WebElement YourOrders = driver.findElement(By.xpath("//span[text()='Your Orders']"));
//	act.moveToElement(acc).perform();
//	act.moveToElement(YourOrders).perform();
//	act.click().perform();
//	
	// or using method chaining
	act.moveToElement(acc).moveToElement(YourOrders).click().build().perform();
	System.out.println("end");
	

}
}