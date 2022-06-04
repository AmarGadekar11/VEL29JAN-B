package testpack;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup {
	public static void main (String[]args) throws InterruptedException, IOException
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.w3schools.com/js/js_popup.asp");
	WebElement tryyourself = driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[1]"));
	
	tryyourself.click();
	String url = driver.getCurrentUrl();
	System.out.println(url);
	
	// switch to child browser
	ArrayList<String> addr = new ArrayList<String>(driver.getWindowHandles());
	String addrOfChildBrowser = addr.get(1);
	driver.switchTo().window(addrOfChildBrowser);
	
	url = driver.getCurrentUrl();
	System.out.println(url);
	
	//Return to main page
	String addrOfMainBrowser = addr.get(0);
	driver.switchTo().window(addrOfMainBrowser);
	
	
	
}
}