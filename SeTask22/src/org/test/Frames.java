//4.Write code for handling Frames
package org.test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Frames {
public static void main(String[] args) {
	System.setProperty("Webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SeTask22\\Driver\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://demo.guru99.com/test/newtours/");
	
	driver.manage().window().maximize();
	
	driver.switchTo().frame("a077aa5e");
	
	WebElement iframe = driver.findElement(By.xpath("//iframe[@src='ads.html]"));
	
	driver.switchTo().frame(iframe);
	
	WebElement image = driver.findElement(By.xpath("//img[@src='jmeter720.png']"));
	image.click();
	
}
}
