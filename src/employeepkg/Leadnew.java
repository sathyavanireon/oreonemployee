package employeepkg;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Leadnew {
	WebDriver driver;
	

	 
	@BeforeClass
	public void setup() {
	
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://stage.oreon.reontel.com/");	 
	}
	 

 
	 
	@Test
		
	 public void method1() throws InterruptedException, AWTException
	 
	 {
		 
        
		 
	     driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[3]/div/form/div[1]/div[1]/div/div[1]/div/div/input")).sendKeys("admin@reontel.com");
	   driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[3]/div/form/div[2]/div/div/div[1]/div/div/input")).sendKeys("Reon@123");
	    Thread.sleep(2000);
	  
	    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[3]/div/form/div[4]/div/button")).click();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	
	 
	  driver.findElement(By.xpath("//label[contains(text(),'CRM')]")).click();
	 
	// Thread.sleep(2000);
	 
	 
//	 driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[6]/div[2]/div[1]/button[1]")).click(); // submission without data
	 
	
	// Add lead
	 
	 driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/p[1]/*[1]")).click();
	 driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("Geetu");
	 
	 driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/span[1]/input[1]")).sendKeys("9878788787");
	 driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[4]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("remya@gmail.com");
	
	 JavascriptExecutor js = (JavascriptExecutor) driver;
     // Scroll down the webpage by 500 pixels vertically
     js.executeScript("window.scrollBy(0,10000)");
     
	 
	// Thread.sleep(2000);
	 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div[2]/div[2]/div/div[2]/div[2]/div[1]/div/form/div[2]/div/div[1]/div[2]/div[1]/div/div[1]/div/div[1]/div/div/div")).click();
	 
	 
	// Thread.sleep(2000);
	 driver.findElement(By.xpath(" //div[contains(text(),'Email')]")).click();
	 
	//Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div[2]/div[2]/div/div[2]/div[2]/div[1]/div/form/div[2]/div/div[3]/div[2]/div/div/div/div/div/div/div")).click();
	 
	 
 // Thread.sleep(2000);
	 driver.findElement(By.xpath("//div[contains(text(),'SKU001-DUC150 Cordless Pruning Saw')]")).click();
	 
	 
	 
	
    driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]")).click();
	 WebElement emp = driver.findElement(By.xpath("//div[@class='ant-select-item-option-content'][text()='Nikhitha']"));
     emp.click();
     
    js.executeScript("window.scrollBy(0,10000)");
    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div[2]/div[2]/div/div[2]/div[2]/div[1]/div/form/div[4]/div/div[3]/div[2]/div/div/div/div/div/input")).sendKeys("koratty");
    
    driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[4]/div[1]/div[4]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/span[1]/input[1]")).sendKeys("8867645676");
    
    driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[4]/div[1]/div[5]/div[1]/div[1]/label[1]/span[1]/input[1]")).click();
	
    js.executeScript("window.scrollBy(0,10000)");
    driver.findElement(By.xpath("//span[contains(text(),'Select File')]")).click();
    
    
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
		 
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,20000)"); 
		WebElement a= driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[6]/div[2]/div[1]/button[1]"));
		a.click();
		
		
	 }
	 
	@Test(dependsOnMethods = {"method1"})
	 
	 public void method2() throws InterruptedException {
	 
	 
		WebElement c=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div[2]/div[2]/div/div[2]/div[2]/div[2]/div/div/div[2]/div/div/button"));
				c.click();
	driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div[2]/div[2]/div/form/div/div[1]/div[2]/div[1]/div/div[1]/div/div/input")).sendKeys("rithu");
	driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div[2]/div[2]/div/form/div/div[2]/div[2]/div/div/div/div[1]/div/div[1]/div/div/span/span/input")).sendKeys("8867564565");
	driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div[2]/div[2]/div/form/div/div[5]/div[2]/div[1]/div/div[1]/div/div/input")).sendKeys("abc@gmail.com");
	driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div[2]/div[2]/div/form/div/div[8]/div/div/div/div/div/label/span/input")).click();
	driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div[2]/div[2]/div/form/div/div[9]/div[2]/div")).click();
	
	
	
	
	
	//Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div[2]/div[2]/div/div[2]/div[2]/div[2]/div/div/div[1]/div/div/div/div/div/div/div/table/tbody/tr/td[6]/div/div/div/div/div[2]/div")).click();
	 
	//edit contact
	 
	 WebElement selectedContact = driver.findElement(By.xpath("//p[contains(text(),'rithu')]"));
 if (selectedContact.isDisplayed()) {
		 
		 WebElement q=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div[2]/div[2]/div/div[2]/div[2]/div[2]/div/div/div[1]/div/div/div/div/div/div/div/table/tbody/tr[2]/td[6]/div/div/div/div/div[2]/div"));
		 q.click();
		 
		// Thread.sleep(2000); 
	    
	  //   driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div[2]/div/form/div/div[9]/div[2]/div/button/span")).click();
	     
	 } else {
			
		 System.out.println("Selected contact is not displayed.");
		 
		 
		
		 }
	
	 

//	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div[2]/div[2]/div/div[2]/div[2]/div[2]/div/div/div[3]/div[2]/div/button/span")).click();
	
	 }
	 
	 
	 
	 
}
