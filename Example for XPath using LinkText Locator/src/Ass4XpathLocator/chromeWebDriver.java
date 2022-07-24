package Ass4XpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class chromeWebDriver {
	public WebDriver driver;
	
  @Test
  public void chrom() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\lo0ol\\" + "Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		// Navigate to a website
		driver.navigate().to("https://www.elm.sa/en/Pages/default.aspx");
		
		// Mazimize current window
		driver.manage().window().maximize();
		
		// Define the web element to find it
		WebElement classMethod = driver.findElement(By.xpath("//a[normalize-space()='Privacy Policy']"));
		classMethod.click();
		
		// Delay execution for 5 seconds after find specific web element
		Thread.sleep(5000);
		
		// Close the browser
		driver.quit();
  }
}
