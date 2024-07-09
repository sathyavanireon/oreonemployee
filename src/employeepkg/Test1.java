package employeepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Test1 {
	
	WebDriver driver;
	
	@BeforeClass
	public void Lead () {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Reon\\Downloads\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://chatgpt.com/");
		
			
			
		
	}
	
	@Test
	public void manul () {
		
		driver.findElement(By.xpath("test")).click();

	}

}

