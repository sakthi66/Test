package test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

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
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://test.thebramha.com/erp");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    String Url = driver.getCurrentUrl();
	    System.out.println(Url);
	    driver.findElement(By.id("username")).sendKeys("thebramhatest+admin1@gmail.com");
	    driver.findElement(By.id("password")).sendKeys("Test@1234");
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
	    driver.findElement(By.id("email")).sendKeys("thebramhatest+customer123@gmail.com");
	    driver.findElement(By.id("title")).sendKeys("Mr");
	    driver.findElement(By.id("firstName")).sendKeys("sakthi");
	    driver.findElement(By.id("lastName")).sendKeys("vel");
	    driver.findElement(By.id("dob")).sendKeys("10/05/1999");
	    Robot r=new Robot();
	    r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
        driver.findElement(By.id("genderId")).click();
        driver.findElement(By.xpath("//div[text()='Male']")).click();
        driver.findElement(By.id("phoneNumber")).sendKeys("+919629889896");
        driver.findElement(By.id("anniversary")).sendKeys("18/10/2022");
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
        driver.findElement(By.xpath("//div[text()='Customer Address']")).click();
        driver.findElement(By.xpath("//button[text()=' Add']")).click();
        driver.findElement(By.id("address_0_title")).sendKeys("MR");
        driver.findElement(By.id("address_0_email")).sendKeys("gvj@gmail.com");
        driver.findElement(By.id("address_0_firstName")).sendKeys("s");
        driver.findElement(By.id("address_0_lastName")).sendKeys("vj");
        driver.findElement(By.id("address_0_addressLine1")).sendKeys("53/1,vivekananda street");
        driver.findElement(By.id("address_0_addressLine2")).sendKeys("NG pudur");
        driver.findElement(By.id("address_0_city")).sendKeys("Coimbatore");
        driver.findElement(By.id("address_0_stateId")).click();
        r.keyPress(KeyEvent.VK_ENTER);
       	r.keyRelease(KeyEvent.VK_ENTER);
       	driver.findElement(By.id("address_0_countryId")).click();
       	r.keyPress(KeyEvent.VK_ENTER);
       	r.keyRelease(KeyEvent.VK_ENTER);
       	driver.findElement(By.id("address_0_pincode")).sendKeys("641029");
       	driver.findElement(By.id("address_0_phoneNumber")).sendKeys("+919629889896");
       	driver.findElement(By.xpath("//button[text()=' Create']")).click();
        Thread.sleep(2000);
       	driver.findElement(By.xpath("//button[text()='Yes']")).click();
   
	}

}
