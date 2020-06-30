package testLocators;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VariosLocators {
	
	WebDriver driver;
	
	@Before
	public void lunchBrowser() {
		
//		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("http://www.objectspy.space/");
		driver.manage().window().maximize();
		
	}
	@Test
	public void test() throws InterruptedException {
		
		//driver.findElement(By.xpath("//strong[contains(text(),'Link Test : New Page')]")).click();
		//driver.findElement(By.xpath("//strong[contains(text(),'Link Test : New Page')]")).click();
		//driver.findElement(By.id("sex-0")).click();
		//driver.findElement(By.xpath("//input[@id='sex-0']")).click();
		//driver.findElement(By.linkText("OS-API Product FrontEnd")).click();
		
		//driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		//Thread.sleep(3000);
		
		//driver.findElement(By.cssSelector("input#exp-2")).click();
		//driver.findElement(By.cssSelector("input.input-file")).click();
		//driver.findElement(By.xpath("//input[@class='input-file']")).click();
		driver.findElement(By.xpath("//input[@id='photo']")).click();
		Thread.sleep(3000);
	}
	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}
}
