package test;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Customer login
public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/home/and/Downloads/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://test.thebramha.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String url = driver.getCurrentUrl();
		System.out.println("Url:"+url);
		String title = driver.getTitle();
		if(title.equals("Home - The Bramha"))
		{
			System.out.println("Title:"+title);
		}
		else {
		System.out.println("Fail");
		}
		driver.findElement(By.xpath("(//div[contains(@class,'ant-dropdown')])[1]")).click();
		driver.findElement(By.xpath("(//li[contains(@role,'menuitem')])[1]")).click();
		driver.findElement(By.id("username")).sendKeys("thebramhatest+customer1@gmail.com");
		WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("Test@1234");
        
        Dimension size = password.getSize();
        int h = size.getHeight();
        int w = size.getWidth();
        System.out.println("height:"+h);
        System.out.println("width:"+w);
        driver.findElement(By.xpath("//span[contains(@class,'ant-input-suffix')]")).click();
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("(//div[text()='Categories'])[1]")).click();
        WebElement jhumka = driver.findElement(By.xpath("(//a[contains(@href,'/category/jhumka')])[1]"));
        
        Point loc = jhumka.getLocation();
        int x = loc.getX();
        int y = loc.getY();
        System.out.println("X:"+x);
        System.out.println("Y:"+y);
        jhumka.click();
        driver.findElement(By.xpath("//div[@class='css-5tia5t']")).click();
        Set<String> child = driver.getWindowHandles();
        for(String b:child)
        {
       	driver.switchTo().window(b);
        }
        driver.findElement(By.xpath("//button[contains(text(),'Buy Now')]")).click();
        driver.findElement(By.xpath("//button[text()='Checkout']")).click();
        WebElement Selectbtn = driver.findElement(By.xpath("//button[text()='Select']"));
        Selectbtn.click();
        WebElement Continuebtn = driver.findElement(By.xpath("//button[text()='Continue']"));
        Dimension s = Continuebtn.getSize();
        int ht = s.getHeight();
        int wt = s.getWidth();
        System.out.println("height1:"+ht);
        System.out.println("width1:"+wt);
        Continuebtn.click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[text()='Continue']")).click();
        
        
        

	}

}
