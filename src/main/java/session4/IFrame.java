package session4;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame {

	WebDriver driver;
	
	@Test
	public void launchBrowser() throws InterruptedException {
		
		//setting the properties for chrome driver
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		// creating web driver object
		driver = new ChromeDriver();
		
		//maximizing window
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// go to the link
		driver.get("https://docs.oracle.com/javase/8/docs/api/");
		Thread.sleep(2000);
		
		driver.switchTo().frame("packageListFrame");
		Thread.sleep(2000);

		driver.findElement(By.linkText("java.applet")).click();
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.linkText("AppletContext")).click();

		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.switchTo().frame("classFrame");
	
			}

}
