package session4;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseScroll {
	WebDriver driver;

	@Test
	public void launchBrowser() throws InterruptedException {

		// setting the properties for chrome driver
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		// creating web driver object
		driver = new ChromeDriver();

		// maximizing window
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// go to the link
		driver.get("https://www.dell.com/en-us");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scroll(0, 600)");
		
		Thread.sleep(2000);
		
		js.executeScript("scroll(0, 0)");
		

//		WebElement PRODUCT_MENU_LOCATOR = driver.findElement(By.xpath("//button[@id='l1']"));
//		WebElement NETWORKING_MENU_LOCATOR = driver.findElement(By.xpath("//a[@id=\"l1_5\"]/span"));
//		
//		Actions action = new Actions(driver);
//		action.moveToElement(PRODUCT_MENU_LOCATOR).build().perform();
//		Thread.sleep(1000);
//		action.moveToElement(NETWORKING_MENU_LOCATOR).build().perform();
	}

}
