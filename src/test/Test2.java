package test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


//Create Product
public class Test2 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","/home/and/Downloads/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://test.thebramha.com/erp/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.findElement(By.id("username")).sendKeys("thebramhatest+admin1@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Test@1234");
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		
		String title = driver.getTitle();
		if(title.equals("Login - The Bramha ERP")) {
			System.out.println(title);
			
		}
		else
		{
			System.out.println("fail");
	    }
		driver.findElement(By.xpath("(//li[@class='ant-menu-submenu ant-menu-submenu-inline'])[1]")).click();
		driver.findElement(By.xpath("//span[text()=' Create Product']")).click();
        driver.findElement(By.id("partnerId")).click();
        WebElement ele = driver.findElement(By.xpath("(//div[text()='DOC-IND-TN-009-2022-0003'])[2]"));
        ele.click();
        Dimension s = ele.getSize();
        int h = s.getHeight();
        int w = s.getWidth();
        System.out.println("Height:"+h);
        System.out.println("Width:"+w);
        driver.findElement(By.id("partnerProductCode")).sendKeys("SVG-89");
        driver.findElement(By.id("name")).sendKeys("Js");
        WebElement spid = driver.findElement(By.id("shippingPointId"));
        spid.click();
        driver.findElement(By.xpath("(//div[text()='DOC-TN-2022-001'])[2]")).click();
        
        Point loc=spid.getLocation();
        int x = loc.getX();
        int y = loc.getY();
        System.out.println("X:"+x);
        System.out.println("Y:"+y);
        
        driver.findElement(By.id("description")).sendKeys("good product");
        driver.findElement(By.id("longDescription")).sendKeys("good good product");
        driver.findElement(By.id("category")).click();
        driver.findElement(By.xpath("//div[text()='Ear Stud']")).click();
        driver.findElement(By.id("subCategoryId")).click();
        driver.findElement(By.xpath("//div[text()='Elegant']")).click();
        driver.findElement(By.cssSelector("input[id='currencyId']")).click();
        driver.findElement(By.xpath("//div[text()='INR']")).click();
        driver.findElement(By.id("productUomId")).click();
        driver.findElement(By.xpath("//div[text()='PC']")).click();
        driver.findElement(By.id("leadTime")).sendKeys("5");
        driver.findElement(By.id("stockQuantity")).sendKeys("3");
        driver.findElement(By.xpath("//span[text()='Fixed Without Breakup']")).click();
        driver.findElement(By.id("screenPrice")).sendKeys("5000");
        driver.findElement(By.id("commissionPercentage")).sendKeys("5");
        driver.findElement(By.id("metal_metalId")).click();
        driver.findElement(By.xpath("//div[text()='Gold']")).click();
        driver.findElement(By.id("metal_purityId")).click();
        driver.findElement(By.xpath("//div[text()='24K']")).click();
        driver.findElement(By.id("metal_colorId")).click();
        driver.findElement(By.xpath("//div[text()='White']")).click();
        
        driver.findElement(By.id("metal_description")).sendKeys("it is a nice metal");
        driver.findElement(By.id("metal_detail")).sendKeys("nice metal");
        driver.findElement(By.id("metal_weightUomId")).click();
        driver.findElement(By.xpath("(//div[text()='gm'])[1]")).click();
        driver.findElement(By.xpath("//input[@id='metal_weight'][@class='ant-input-number-input']")).sendKeys("5");
        Robot r=new Robot();
        r.keyPress(KeyEvent.VK_PAGE_DOWN);
        r.keyRelease(KeyEvent.VK_PAGE_DOWN);
        Thread.sleep(2000);
        driver.findElement(By.id("dimensionUomId")).click();
        driver.findElement(By.xpath("//div[text()='mm']")).click();
        driver.findElement(By.id("width")).sendKeys("2");
        driver.findElement(By.id("height")).sendKeys("1");
        driver.findElement(By.id("thickness")).sendKeys("6");
        driver.findElement(By.id("length")).sendKeys("3");
        driver.findElement(By.id("size")).sendKeys("4");
        driver.findElement(By.id("weightUomId")).click();
        driver.findElement(By.xpath("(//div[text()='gm'])[3]")).click();
        Thread.sleep(2000);
        Actions a=new Actions(driver);
        a.sendKeys(Keys.PAGE_UP).build().perform();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[text()='Gems Details']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[text()=' Add Gem']")).click();
        driver.findElement(By.id("stones_0_gemId")).click();
        driver.findElement(By.xpath("//div[text()='Diamond']")).click();
        driver.findElement(By.id("stones_0_quantity")).sendKeys("5");
        driver.findElement(By.id("stones_0_weightUomId")).click();
        r.keyPress(KeyEvent.VK_DOWN);
        r.keyRelease(KeyEvent.VK_DOWN);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
        driver.findElement(By.id("stones_0_weight")).sendKeys("3");
        driver.findElement(By.id("stones_0_gemSizeUomId")).click();
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
        driver.findElement(By.id("stones_0_gemSize")).sendKeys("5");
        driver.findElement(By.xpath("//div[text()='Beads Details']")).click();
        driver.findElement(By.xpath("//button[text()=' Add Bead']")).click();
        
        driver.findElement(By.id("beads_0_beadId")).click();
        driver.findElement(By.xpath("//div[text()='Coral']")).click();
        driver.findElement(By.id("beads_0_quantity")).sendKeys("12");
        driver.findElement(By.id("beads_0_weightUomId")).click();
        r.keyPress(KeyEvent.VK_DOWN);
        r.keyPress(KeyEvent.VK_DOWN);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
        driver.findElement(By.id("beads_0_weight")).sendKeys("3");
        driver.findElement(By.id("beads_0_beadSizeUomId")).click();
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
        driver.findElement(By.xpath("//div[text()='Additional Data']")).click();
        driver.findElement(By.xpath("//span[text()='Off The Shelf']")).click();
        driver.findElement(By.id("hsnCodeId")).click();
        driver.findElement(By.xpath("(//div[text()='71090000'])[2]")).click();
        driver.findElement(By.xpath("//div[text()='Images']")).click();
        driver.findElement(By.xpath("(//div[text()='No Image'])[1]//following::button[1]")).click();
        Thread.sleep(2000);
        r.mousePress(InputEvent.BUTTON1_MASK);
        r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(2000);
        r.keyPress(KeyEvent.VK_PAGE_DOWN);
        r.keyRelease(KeyEvent.VK_PAGE_DOWN);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
        driver.findElement(By.xpath("(//div[text()='No Image']//following::button)[4]")).click();
        Thread.sleep(2000);
        r.keyPress(KeyEvent.VK_PAGE_DOWN);
        r.keyRelease(KeyEvent.VK_PAGE_DOWN);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);  
        driver.findElement(By.xpath("(//div[text()='No Image']//following::button)[7]")).click();
        Thread.sleep(2000);
        r.keyPress(KeyEvent.VK_PAGE_DOWN);
        r.keyRelease(KeyEvent.VK_PAGE_DOWN);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
        r.keyPress(KeyEvent.VK_PAGE_UP);
        Thread.sleep(2000);
        r.keyRelease(KeyEvent.VK_PAGE_UP);
        driver.findElement(By.xpath("//div[text()='Price Summary']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[text()=' Create']")).click();
        driver.findElement(By.xpath("//button[text()='Yes']")).click();
      
       
      
	}

}
