package org.test;

import java.io.File;
import java.nio.file.Files;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {
public static void main(String[] args) {
	
 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SeTask20\\driver\\chromedriver.exe");	

	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
	driver.manage().window().maximize();
	
	TakesScreenshot Tk=(TakesScreenshot) driver;
	
	File screenshotAs = Tk.getScreenshotAs(OutputType.FILE);
	
	System.out.println(screenshotAs);
	
	File f=new File("D:\\chn\\tnj\\try\\facebooklogin.png");
	
	
	
	
}
	
	
	
	
	
	
	
	
}
