package employeepkg;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MasterCountry {
	WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		WebDriverManager.chromedriver().setup(); // open browser
		driver=new ChromeDriver();
		
	}
	
	@BeforeMethod
	 public void urlloading() 
	{
		driver.get("https://dev.oreon.reontel.com/");
		driver.manage().window().maximize();
	}
	
	@SuppressWarnings("deprecation")
	@Test
	
	public void main() throws InterruptedException
	
	{
		
	
		
		//login
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[3]/div/form/div[1]/div[1]/div/div[1]/div/div/input")).sendKeys("admin@reontel.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[3]/div/form/div[2]/div[1]/div/div[1]/div/div/input")).sendKeys("Reon@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[3]/div/form/button")).click();
		//Thread.sleep(2000);
		
	
		//country name  dropdown click
		
		Thread.sleep(2000);	
		WebElement ele=driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[10]"));
		Actions action1= new Actions(driver);
		action1.moveToElement(ele).perform();
		ele.click();
		
		Thread.sleep(2000);
		WebElement mcountry=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div[1]/div/div/ul/li[1]/a"));
		Actions action2= new Actions(driver);
		action2.moveToElement(mcountry).perform();
		mcountry.click();
		
		Thread.sleep(2000);
		WebElement Addcountry=driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]"));
		Actions action3= new Actions(driver);
		action3.moveToElement(Addcountry).perform();
		Addcountry.click();
		
		
	//	countryname dropdown click
		Thread.sleep(2000);
	WebElement cntryname=	driver.findElement(By.xpath("//body/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]"));
	cntryname.click();
	Thread.sleep(2000);
	
	
	
WebElement country1 =driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div[1]/div/div/div[6]/div"));
	
Actions action4= new Actions(driver);
action4.moveToElement(country1).perform();
country1.click();
	
	
	
	
	//WebElement dp_down = driver.findElement(By.xpath("//div[contains(text(),'Belize')]"));
	//dp_down.sendKeys(Keys.ARROW_DOWN, Keys.RETURN);
	
	Thread.sleep(2000);
	 driver.findElement(By.xpath("//span[contains(text(),'Submit')]")).click();
	
	 Thread.sleep(2000);
	WebElement Addcty= driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]"));
	Addcty.click();
	 
	 
Thread.sleep(2000);
WebElement ctyclick= driver.findElement(By.xpath("//body/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]"));
ctyclick.click();
	 
Thread.sleep(2000);

WebElement countryagain =driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div[1]/div/div/div[6]/div"));

Actions action5= new Actions(driver);
action5.moveToElement(countryagain).perform();
countryagain.click();


	 
 driver.findElement(By.xpath(" //span[contains(text(),'Cancel')]")).click();

	 Thread.sleep(2000);
	WebElement  ConSearch=  driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/span[1]/input[1]"));
	ConSearch.sendKeys(" Anguilla");
	
	 Thread.sleep(1000);
	 ConSearch.sendKeys(Keys.chord(Keys.CONTROL, "a"), Keys.BACK_SPACE); 
	
	Thread.sleep(2000);
	WebElement condel= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div[2]/div[2]/div/div[2]/div/div/div/div/div/div/table/tbody/tr[1]/td[4]/div/div"));
	condel.click();
	
	
Thread.sleep(2000);
 WebElement delcntry= driver.findElement(By.xpath("//span[contains(text(),'Delete')] "));
	delcntry.click();
	
	}
	                                             
	}

