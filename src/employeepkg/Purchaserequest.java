package employeepkg;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Purchaserequest {
	
	WebDriver driver;

	 @BeforeTest
	 
	 public void setup()
	 
	 {
	
		
		WebDriverManager.edgedriver().setup();
		
	    driver=new EdgeDriver();
	   
	 }
	 
	 @BeforeMethod
	 
	 public void url() throws InterruptedException
	 
	 {

		 driver.get(" https://stage.oreon.reontel.com/");
		 
		 driver.manage().window().maximize();
		 Thread.sleep(3000);
	 }
	 
	 @SuppressWarnings("deprecation")
	@Test
		
	 public void Purchase() throws InterruptedException, AWTException
	 
	 {
		 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[3]/div/form/div[1]/div[1]/div/div[1]/div/div/input")).sendKeys("admin@reontel.com");
		   driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[3]/div/form/div[2]/div/div/div[1]/div/div/input")).sendKeys("Reon@123");
		    Thread.sleep(2000);
		 
		    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[3]/div/form/div[4]/div/button")).click();
			  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			  
		driver.findElement(By.xpath("//label[contains(text(),'Purchase')]")).click();
		
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/div[1]/div[1]")).click();

		 driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/p[1]/*[1]")).click();
		 
		// date picker
		 
		 driver.findElement(By.xpath("//*[@id=\"addForm_pr_date\"]")).click();
		 
		 Thread.sleep(2000);
		 WebElement l = driver.findElement(By.xpath("//div[@class='ant-picker-cell-inner'][text()='19']"));
	     l.click();
	    
	     
	   WebElement g=  driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]"));
	     
		g.click();
		
		 
		 Thread.sleep(10000);
		 WebElement m = driver.findElement(By.xpath("//div[@class='ant-select-item-option-content'][text()='Rakesh']"));
		 m.click();

		 Thread.sleep(3000);
		 WebElement date1 = driver.findElement(By.xpath("//*[@id=\"addForm_pr_exp_delivery_date\"]"));
	     date1.click();
	     
	  List<WebElement> allDates=driver.findElements(By.xpath("//table[@class='ant-picker-content']//div"));
			
         // now we will iterate all values and will capture the text. We will select when date is 28
	for(WebElement ele:allDates)
	{
		
		String dates=ele.getText();
		System.out.println(dates);
                 // once date is 28 then click and break
	if(dates.equalsIgnoreCase("17"))
		{
			
			
			ele.click();
			break;
		}
	}
	
	

		WebElement y=driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[5]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]"));
		y.click();
		
		
		Thread.sleep(2000);
		 WebElement k = driver.findElement(By.xpath("//div[contains(text(),'SO-00018')]"));
	     k.click();
	    
		
	     
	 
	

	 driver.findElement(By.xpath("//*[@id=\"addForm\"]/div/div[1]/div[4]/div[2]/div/div/div/div/div/input")).sendKeys("koratty");
	 
	 
	 
	 //file upload
	 
	  driver.findElement(By.xpath("//*[@id=\"addForm\"]/div/div[1]/div[5]/div[3]/div[2]/div/div/div/div/div/span/div[1]/span/div/p/span")).click();
		
	   
	    
	    fileupload("C:\\Users\\Reon\\Desktop\\al-bahriya\\Brand.xlsx");

		 }
	    
		 public  void fileupload (String path) throws AWTException, InterruptedException
		 {
			 
			 StringSelection strSelecion = new StringSelection(path);
			 
			 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strSelecion, null);
			 
			 
			 
			 Robot robot= new Robot();
			 
			 robot.delay(3000);
			 
			 robot.keyPress(KeyEvent.VK_CONTROL);
			 robot.keyPress(KeyEvent.VK_V);
			 robot.keyRelease(KeyEvent.VK_V);
			 robot.keyRelease(KeyEvent.VK_CONTROL);
			 robot.keyPress(KeyEvent.VK_ENTER);
			 robot.delay(2000);
			 robot.keyRelease(KeyEvent.VK_ENTER);
			 
			
			 driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[6]/div[1]")).click();
			 
			 Thread.sleep(10000);
			 List<WebElement> alDates=driver.findElements(By.xpath("//table[@class='ant-picker-content']//div"));
				
	         // now we will iterate all values and will capture the text. We will select when date is 28
		for(WebElement el:alDates)
		{
			
			String dates=el.getText();
			System.out.println(dates);
	                 // once date is 28 then click and break
		if(dates.equalsIgnoreCase("17"))
			{
				
				
				el.click();
				break;
			}
		}
			 
			 
			 
			 JavascriptExecutor js = (JavascriptExecutor) driver;
			 js.executeScript("window.scrollBy(0,20000)"); 
			WebElement a= driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/button[1]"));
			a.click();
			
	 
	// driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/span[1]/input[1]")).sendKeys("PR-00002");
	 
	 
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[7]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]")).click();
	 driver.findElement(By.xpath("//body/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/button[2]")).click();
		
		 
		 
		 }
	
	 }
	 
	
		
	
		
		
	
