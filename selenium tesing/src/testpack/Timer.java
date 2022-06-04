package testpack;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Timer {
	public static void main (String[]args) throws InterruptedException, IOException
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	Random random = new Random();
	int a= random.nextInt(10);
	for(int i=0;i<5;i++)
	{	
     LocalDateTime now =LocalDateTime.now();
	File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	DateTimeFormatter format = DateTimeFormatter.ofPattern(" dd-mm-YYYY, HH-MM-SS");
	File dest = new File("C:\\Users\\Dell\\OneDrive\\Pictures\\Screenshots\\sele12\\Test"+a+i+now.format(format)+".jpeg");
    FileHandler.copy(source, dest);
    
    Thread.sleep(1000);
    
    
    }
	
	}
}
