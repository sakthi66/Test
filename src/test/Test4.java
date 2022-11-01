package test;

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

public class Test4 {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","/home/and/Downloads/chromedriver.exe");
		FileInputStream fis=new FileInputStream("/home/and/eclipse-workspace/Thebramha/src/data.properties");
		Properties p=new Properties();
		p.load(fis);
		WebDriver driver=new ChromeDriver();
		driver.get("https://test.thebramha.com/erp/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String Url=driver.getCurrentUrl();
		System.out.println("Url: "+Url);
		String title=driver.getTitle();
		if(title.equals("Login - The Bramha ERP")) {
			System.out.println("Title: "+title);
			
		}
		else {
			TakesScreenshot ts=(TakesScreenshot)driver;
			File from=ts.getScreenshotAs(OutputType.FILE);
			File to=new File("/home/and/Downloads/testimage.png");
			FileUtils.copyFile(from, to);
			System.out.println("fail");
		}
	    driver.findElement(By.id("username")).sendKeys(p.getProperty("email"));
		driver.findElement(By.id("password")).sendKeys(p.getProperty("password"));
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		driver.findElement(By.xpath("//span[text()=' Customers']")).click();
		driver.findElement(By.xpath("//span[text()=' Create Customer']")).click();
		driver.findElement(By.id("email")).sendKeys(p.getProperty("Email"));
		driver.findElement(By.id("firstName")).sendKeys(p.getProperty("FirstName"));
		
	}

}
