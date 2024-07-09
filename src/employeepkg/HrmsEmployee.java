package employeepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HrmsEmployee {
	
WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		WebDriverManager.edgedriver().setup(); // open browser
		driver=new EdgeDriver();
		
	}
	
	@BeforeMethod
	 public void urlloading() 
	{
		driver.get("https://test.oreon.reontel.com/");
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
		
		Thread.sleep(2000);	
		WebElement ele=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[1]/div/div/div/div[2]/div/div[2]/div/div[3]/label"));
		Actions action1= new Actions(driver);
		action1.moveToElement(ele).perform();
		ele.click();
		
		
		Thread.sleep(2000);
		WebElement Hemployee=driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[5]/a[1]/div[1]"));
		Actions action2= new Actions(driver);
		action2.moveToElement(Hemployee).perform();
		Hemployee.click();
		

		Thread.sleep(2000);
		WebElement AddEmployee=driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/p[1]/*[1]"));
		Actions action3= new Actions(driver);
		action3.moveToElement(AddEmployee).perform();
		AddEmployee.click();
		
		//Add employee Basic info
		
		Thread.sleep(1000);
		WebElement Addfirstname=driver.findElement(By.xpath("//*[@id=\"addForm\"]/div[1]/div[2]/div[2]/div[1]/div/div[1]/div/div/input"));
		Addfirstname.sendKeys("Meenu");
		
		Thread.sleep(1000);
		WebElement Addlastname=driver.findElement(By.xpath("//*[@id=\"addForm\"]/div[1]/div[3]/div[2]/div[1]/div/div[1]/div/div/input"));
		Addlastname.sendKeys("vijayakumar");
		
		Thread.sleep(1000);
		WebElement AddDOB=driver.findElement(By.xpath("//input[@id='addForm_dob']"));
		AddDOB.click();
		
		Thread.sleep(1000);
	   driver.findElement(By.xpath("//div[contains(text(),'29')]")).click();
	   
	  JavascriptExecutor js = (JavascriptExecutor) driver; 
	  js.executeScript("window.scrollBy(0, 500)");
	  
	   
	   Thread.sleep(1000);
	   WebElement maleRadioBtn= driver.findElement(By.xpath("//*[@id=\"addForm_gender\"]/label[1]/span[1]/input"));
       Actions action4= new Actions(driver);
      action4.moveToElement(maleRadioBtn).perform();
	  maleRadioBtn.click();

	     Thread.sleep(2000);
		WebElement femaleRadioBtn= driver.findElement(By.xpath("//*[@id=\"addForm_gender\"]/label[2]/span[1]/input"));
		Actions action5= new Actions(driver);
	    action5.moveToElement(femaleRadioBtn).perform();
	    femaleRadioBtn.click();
	 
	  if (!femaleRadioBtn.isSelected()) {
          femaleRadioBtn.click();
      }
	  
	  Thread.sleep(2000);
		WebElement Addnationality=driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[6]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]"));
		//Actions action6= new Actions(driver);
	//	action6.moveToElement(Addnationality).perform();
		Addnationality.click();
	   
	   Thread.sleep(2000);
	 WebElement   Nationality = driver.findElement(By.xpath("//div[contains(text(),'India')]"));
		
	  Actions action6= new Actions(driver);
	   action6.moveToElement(Nationality).perform();
	  Nationality.click();
	  
	  
	  
	  Thread.sleep(2000);
		WebElement AddRole=driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[7]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]"));
		AddRole.click();
	  
		WebElement Role =driver.findElement(By.xpath("//div[contains(text(),'superadmin')]"));
		
	Actions action7= new Actions(driver);
		action7.moveToElement(Role).perform();
		Role.click();
	  
		
		  
		Thread.sleep(2000);
		 driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/button[2]/span[1]")).click();
		
		//Add employee contact info
		 
		 Thread.sleep(2000);
		WebElement countrycode=  driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/form[1]/div[1]/div[4]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/span[1]/span[1]/div[1]/div[1]/span[2]"));
		countrycode.click();
		
		
		
		Thread.sleep(2000);
		 WebElement Countrycodeselection= driver.findElement(By.xpath("//body/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]"));
		 Countrycodeselection.click();
		 
		 
			Thread.sleep(2000);
			WebElement  PhoneNumber= driver.findElement(By.xpath("//*[@id=\"addForm\"]/div[1]/div[4]/div[2]/div[1]/div/div[1]/div/div/span/span/input"));
				 
			Actions action57= new Actions(driver);
			action57.moveToElement(PhoneNumber).perform();
			PhoneNumber.click();
			PhoneNumber.sendKeys("7687878787546");
		 
		 
	Thread.sleep(2000);
	WebElement  MobileNumber= driver.findElement(By.xpath("//*[@id=\"addForm\"]/div[1]/div[5]/div[2]/div/div/div/div/div/span/span/input"));
		 
	Actions action56= new Actions(driver);
	action56.moveToElement(MobileNumber).perform();
	MobileNumber.click();
	MobileNumber.sendKeys("9999999999");
	
	 
	Thread.sleep(2000);
	WebElement  WhatsAppNo= driver.findElement(By.xpath("//*[@id=\"addForm\"]/div[1]/div[6]/div[1]/div/label/span/input"));
    Actions action571= new Actions(driver);
	action571.moveToElement(WhatsAppNo).perform();
	WhatsAppNo.click();
	
	Thread.sleep(2000);
	WebElement  Email= driver.findElement(By.xpath("//*[@id=\"addForm\"]/div[1]/div[7]/div[2]/div[1]/div/div[1]/div/div/input"));
    Actions action572= new Actions(driver);
	action572.moveToElement(Email).perform();
	Email.click();
	Email.sendKeys("ajith@gmail.com");
	
	Thread.sleep(2000);
	WebElement  ContactName= driver.findElement(By.xpath("//*[@id=\"addForm\"]/div[1]/div[10]/div[2]/div[1]/div/div[1]/div/div/input"));
    Actions action573= new Actions(driver);
	action573.moveToElement(ContactName).perform();
	ContactName.click();
	ContactName.sendKeys("Aswin");
	
	Thread.sleep(2000);
	WebElement  Relationship= driver.findElement(By.xpath("//*[@id=\"addForm\"]/div[1]/div[11]/div[2]/div[1]/div/div[1]/div/div/input"));
    Actions action574= new Actions(driver);
	action574.moveToElement(Relationship).perform();
	Relationship.click();
	Relationship.sendKeys("Brother");
	
	 
		Thread.sleep(2000);
		WebElement  ContactPhone= driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/form[1]/div[1]/div[12]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/span[1]/input[1]"));
	    Actions action521= new Actions(driver);
		action521.moveToElement(ContactPhone).perform();
		ContactPhone.click();
		ContactPhone.sendKeys("887766537365");
		
		
		
		Thread.sleep(2000);
		WebElement  submit= driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/form[1]/div[2]/button[2]"));
	    Actions action522= new Actions(driver);
		action522.moveToElement(submit).perform();
		submit.click();
		
		
		//Add employee contact info
		
		Thread.sleep(2000);
		WebElement EmployeeType =driver.findElement(By.xpath("//input[@id='rc_select_7']"));
	//Actions action716= new Actions(driver);
	//   action716.moveToElement(EmployeeType).perform();
	    EmployeeType.click();
	    
	    

		   Thread.sleep(2000);
		 WebElement  EmployeeTypeselection = driver.findElement(By.xpath("//div[contains(text(),'Full time')]"));
			Actions action63= new Actions(driver);
		   action63.moveToElement(EmployeeTypeselection).perform();
		   EmployeeTypeselection.click();
	    
	   
		   Thread.sleep(2000);    
  WebElement HireDate =driver.findElement(By.xpath("//body[1]/div[6]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[4]/td[3]/div[1]"));
	Actions action168= new Actions(driver);
   action168.moveToElement(HireDate).perform();
    HireDate.click();
	
    Thread.sleep(2000);
    WebElement Department =driver.findElement(By.xpath("//div[contains(text(),'Sales')]"));
	Actions action162= new Actions(driver);
   action162.moveToElement(Department).perform();
   Department.click();
	
    
    
    
} }
