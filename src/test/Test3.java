package test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Create Customer
public class Test3 {

	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","/home/and/Downloads/chromedriver.exe");
		FileInputStream f=new FileInputStream("/home/and/eclipse-workspace/Thebramha/src/data.properties");
		Properties p=new Properties();
		p.load(f);
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://test.thebramha.com/erp");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    String Url = driver.getCurrentUrl();
	    System.out.println(Url);
	    driver.findElement(By.id("username")).sendKeys(p.getProperty("email"));
	    driver.findElement(By.id("password")).sendKeys(p.getProperty("password"));
	    driver.findElement(By.xpath("//button[text()='Log in']")).click();
	    String title=driver.getTitle();
	     
	     if(title.equals("Login - The Bramha ERP")) 
	     {
	       System.out.println(title);
	      }
	    else 
	    {
	        TakesScreenshot ts=(TakesScreenshot)driver;
		    File Ram = ts.getScreenshotAs(OutputType.FILE);
		    File dest=new File("/home/and/Downloads/test1.png");
		    FileUtils.copyFile(Ram,dest);
	   	 	System.out.println("Fail");
	    }
	    driver.findElement(By.xpath("//span[text()=' Customers']")).click();
	    driver.findElement(By.xpath("//span[text()=' Create Customer']")).click();
	    driver.findElement(By.id("email")).sendKeys(p.getProperty("Email"));
	    driver.findElement(By.id("title")).click();
	    driver.findElement(By.xpath("(//div[text()='Mr'])[2]")).click(); 
	    driver.findElement(By.id("firstName")).sendKeys(p.getProperty("FirstName"));
	    driver.findElement(By.id("lastName")).sendKeys(p.getProperty("LastName"));
	    driver.findElement(By.id("middleName")).sendKeys(p.getProperty("MiddleName"));
	    driver.findElement(By.id("dob")).sendKeys(p.getProperty("DOB"));
	    Robot r=new Robot();
	    r.keyPress(KeyEvent.VK_ENTER);
	    r.keyRelease(KeyEvent.VK_ENTER);
        driver.findElement(By.id("genderId")).click();
        driver.findElement(By.xpath("//div[text()='Male']")).click();
        driver.findElement(By.id("phoneNumber")).sendKeys(p.getProperty("PhoneNo"));
        driver.findElement(By.id("anniversary")).sendKeys(p.getProperty("Anniversary"));
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
        driver.findElement(By.xpath("//div[text()='Customer Address']")).click();
        driver.findElement(By.xpath("//button[text()=' Add']")).click();
        driver.findElement(By.id("address_0_title")).sendKeys(p.getProperty("Title"));
        driver.findElement(By.id("address_0_email")).sendKeys(p.getProperty("ContactEmail"));
        driver.findElement(By.id("address_0_firstName")).sendKeys(p.getProperty("FN"));
        driver.findElement(By.id("address_0_lastName")).sendKeys(p.getProperty("LN"));
        driver.findElement(By.id("address_0_addressLine1")).sendKeys(p.getProperty("AddressLine1"));
        driver.findElement(By.id("address_0_addressLine2")).sendKeys(p.getProperty("AddressLine2"));
        driver.findElement(By.id("address_0_city")).sendKeys(p.getProperty("City"));
        driver.findElement(By.id("address_0_stateId")).click();
        r.keyPress(KeyEvent.VK_ENTER);
       	r.keyRelease(KeyEvent.VK_ENTER);
       	driver.findElement(By.id("address_0_countryId")).click();
       	r.keyPress(KeyEvent.VK_ENTER);
       	r.keyRelease(KeyEvent.VK_ENTER);
       	driver.findElement(By.id("address_0_pincode")).sendKeys(p.getProperty("Pincode"));
       	driver.findElement(By.id("address_0_phoneNumber")).sendKeys(p.getProperty("PN"));
       	driver.findElement(By.xpath("//button[text()=' Create']")).click();
        Thread.sleep(2000);
       	driver.findElement(By.xpath("//button[text()='Yes']")).click();
           
	}

}
