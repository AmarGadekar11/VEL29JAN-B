package testpack;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;



public class Screenshot {
	
	public static void main (String[]args) throws InterruptedException, IOException
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	// to take a screenshot
	
	TakesScreenshot t = (TakesScreenshot)driver;
	File source = t.getScreenshotAs(OutputType.FILE);
	File dest = new File("C:\\Users\\Dell\\OneDrive\\Pictures\\Screenshots\\sele12\\Test123.jpeg");
    FileHandler.copy(source, dest);
}
}