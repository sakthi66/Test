package test;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Create Partner
public class Test {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws AWTException, InterruptedException {
		 System.setProperty("webdriver.chrome.driver","/home/and/Downloads/chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("http://test.thebramha.com/erp/login");
		 String url = driver.getCurrentUrl();
         System.out.println("Url:"+url);
         String title=driver.getTitle();
         System.out.println("Title:"+title);
	     
         driver.findElement(By.id("username")).sendKeys("thebramhatest+admin1@gmail.com");
		 driver.findElement(By.id("password")).sendKeys("Test@1234");
		 driver.findElement(By.xpath("//button[text()='Log in']")).click();
		 driver.findElement(By.xpath("//span[text()=' Partners']")).click();
		 driver.findElement(By.xpath("//span[text()=' Create Partner']")).click();
		 driver.findElement(By.id("email")).sendKeys("thebramhatest+partner333@gmail.com");
		 WebElement ele = driver.findElement(By.id("title"));
		 ele.click();
	     
		 driver.findElement(By.xpath("//div[@title='Mr']")).click();
		 driver.findElement(By.id("shortName")).sendKeys("Doc");
		 driver.findElement(By.id("longName")).sendKeys("Bad");
		 driver.findElement(By.id("searchText")).sendKeys("sss");
		 WebElement ele1 = driver.findElement(By.xpath("//div[contains(text(),'Partner Entity Details')]"));
		 ele1.click();
		 driver.findElement(By.id("regnNo")).sendKeys("123456");
		 driver.findElement(By.xpath("//span[text()='India']")).click();
		 driver.findElement(By.id("directorName")).sendKeys("good director");
		 WebElement ele2 = driver.findElement(By.id("brandName"));
		 ele2.sendKeys("Puma");
		 driver.findElement(By.id("description")).sendKeys("good company");
		 driver.findElement(By.id("brandUsp")).sendKeys("good brand USP");
		 WebElement brandURL=driver.findElement(By.id("brandUrl"));
		 brandURL.sendKeys("good brand URL");
		 driver.findElement(By.id("gstin")).sendKeys("8569");
		 
		 driver.findElement(By.id("panNumber")).sendKeys("AWLPA1262B");
		 driver.findElement(By.id("vatNo")).sendKeys("VAT-69");
		 driver.findElement(By.xpath("(//span[text()='No'])[1]")).click();
	
		 driver.findElement(By.xpath("//div[contains(text(),'Partner Bank Details')]")).click();
		 
		 driver.findElement(By.id("bankName")).sendKeys("Axis Bank");
		 driver.findElement(By.id("swiftCode")).sendKeys("2346");
		 driver.findElement(By.id("bankBranchName")).sendKeys("Hopes");
		 driver.findElement(By.id("bankIban")).sendKeys("good IBAN");
		 driver.findElement(By.id("bankBranchPin")).sendKeys("641014");
		 driver.findElement(By.id("bankAddress")).sendKeys("good address");
		 driver.findElement(By.id("ifscCode")).sendKeys("SBIN100256");
		 driver.findElement(By.id("accountNumber")).sendKeys("6473160446");
		 
		 driver.findElement(By.id("accountTypeId")).click();
		 driver.findElement(By.xpath("//div[text()='current']")).click();
		 driver.findElement(By.id("accountHolderName")).sendKeys("Doc");
		 driver.findElement(By.id("upiId")).sendKeys("9628@oksbi");
		 
		 WebElement LogoEsignSeal = driver.findElement(By.xpath("//div[text()='Logo, E Sign, Seal']"));
		 LogoEsignSeal.click();
		 driver.findElement(By.xpath("(//button[@class='css-ccijyr'])[2]")).click();
		 Robot r=new Robot();
		 r.mousePress(InputEvent.BUTTON1_MASK);
		 r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		 r.keyPress(KeyEvent.VK_PAGE_DOWN);
		 r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		 r.keyPress(KeyEvent.VK_LEFT);
		 r.keyRelease(KeyEvent.VK_LEFT);
		 r.keyPress(KeyEvent.VK_DOWN);
		 r.keyRelease(KeyEvent.VK_DOWN);
		 r.keyPress(KeyEvent.VK_DOWN);
		 r.keyRelease(KeyEvent.VK_DOWN);
		 r.keyPress(KeyEvent.VK_DOWN);
		 r.keyRelease(KeyEvent.VK_DOWN);
		 r.keyPress(KeyEvent.VK_DOWN);
		 r.keyRelease(KeyEvent.VK_DOWN);
		 r.keyPress(KeyEvent.VK_ENTER);
		 r.keyRelease(KeyEvent.VK_ENTER);
		 r.keyPress(KeyEvent.VK_RIGHT);
		 r.keyRelease(KeyEvent.VK_RIGHT);
		 r.keyPress(KeyEvent.VK_DOWN);
		 r.keyRelease(KeyEvent.VK_DOWN);
		 Thread.sleep(2000);
		 r.keyPress(KeyEvent.VK_ENTER);
		 r.keyRelease(KeyEvent.VK_ENTER);
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//button[@class='css-ccijyr'])[4]")).click();
		 Thread.sleep(2000);
		 r.mousePress(InputEvent.BUTTON1_MASK);
		 r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		 r.keyPress(KeyEvent.VK_DOWN);
		 r.keyRelease(KeyEvent.VK_DOWN);
		 r.keyPress(KeyEvent.VK_ENTER);
		 r.keyRelease(KeyEvent.VK_ENTER);
		 driver.findElement(By.xpath("(//button[@class='css-ccijyr'])[6]")).click();
		 Thread.sleep(2000);
		 r.mousePress(InputEvent.BUTTON1_MASK);
		 r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		 r.keyPress(KeyEvent.VK_DOWN);
		 r.keyRelease(KeyEvent.VK_DOWN);
		 r.keyPress(KeyEvent.VK_DOWN);
		 r.keyRelease(KeyEvent.VK_DOWN);
		 r.keyPress(KeyEvent.VK_ENTER);
		 r.keyRelease(KeyEvent.VK_ENTER);
		 driver.findElement(By.xpath("//div[text()='Registered Address']")).click();
		 driver.findElement(By.id("city")).sendKeys("coimbatore");
		 driver.findElement(By.id("addressLine1")).sendKeys("53/1,vivekananda street");
		 driver.findElement(By.id("addressLine2")).sendKeys("Ng pudur");
		 driver.findElement(By.id("addressLine3")).sendKeys("Gn mills(po)");
		 driver.findElement(By.id("stateId")).click();
		 r.keyPress(KeyEvent.VK_UP);
		 r.keyRelease(KeyEvent.VK_UP);
		 WebElement tn = driver.findElement(By.xpath("//div[text()='Tamil Nadu']"));
		 tn.click();
		 driver.findElement(By.id("countryId")).sendKeys("India");
		 r.keyPress(KeyEvent.VK_DOWN);
		 r.keyRelease(KeyEvent.VK_DOWN);
		 r.keyPress(KeyEvent.VK_ENTER);
		 r.keyRelease(KeyEvent.VK_ENTER);
		 driver.findElement(By.id("pincode")).sendKeys("641029");
		 driver.findElement(By.id("contactPersonEmail")).sendKeys("gvj@gmail.com");
		 driver.findElement(By.xpath("//button[text()=' Create']")).click();
       //driver.findElement(By.xpath("//button[text()='Yes']")).click();
		
	}
	}