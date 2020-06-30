package session4;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardEvent {
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
		driver.get("http://techfios.com/test/billing/?ng=admin/");

		WebElement USERNAME_ELEMENT = driver.findElement(By.id("username"));
		// identifying the user name field and clear the field. it's a good practice.
		USERNAME_ELEMENT.clear();
		// identifying the user name field and passing user name.
		USERNAME_ELEMENT.sendKeys("techfiosdemo@gmail.com");

		// identifying the pass word field and passing the password.
		driver.findElement(By.id("password")).sendKeys("abc123");
		// identifying the log in button and click it.
		//driver.findElement(By.name("login")).click();
		
		Actions action = new Actions(driver);
		action.sendKeys(Keys.RETURN).build().perform();
	}
	

}
