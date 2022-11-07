package sample;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) throws IOException, AWTException {
		 System.setProperty("webdriver.chrome.driver","/home/and//Downloads/chromedriver.exe");
		 FileInputStream f=new FileInputStream("/home/and/eclipse-workspace/Thebramha/src/data.properties");
		 Properties p=new Properties();
		 p.load(f);
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://test.thebramha.com/erp/login");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 Sample s=new Sample(driver);
		 s.email();
		 s.password();
		 s.login();
		 s.customer();
		 s.cc();
		 s.email1();
		 s.title();
		 s.t1();
		 s.fn();
		 s.ln();
		 s.mn();
		 s.dob();
		 Robot r=new Robot();
		 r.keyPress(KeyEvent.VK_ENTER);
		 r.keyRelease(KeyEvent.VK_ENTER);
		 s.gender();
		 s.g1();
		 s.pn();
		 s.lan();
		 s.anniversary();
		 r.keyPress(KeyEvent.VK_ENTER);
		 r.keyRelease(KeyEvent.VK_ENTER);
		 s.cusaddress();
		 s.add();
		 s.title1();
		 s.A_email();
		 s.A_fn();
		 s.address1();
		 s.address2();
		 s.address3();
		 s.A_ln();
		 s.A_mn();
		 s.A_city();
		 s.A_state();
		 r.keyPress(KeyEvent.VK_ENTER);
		 r.keyRelease(KeyEvent.VK_ENTER);
		 s.A_country();
		 r.keyPress(KeyEvent.VK_ENTER);
		 r.keyRelease(KeyEvent.VK_ENTER);
		 s.A_pincode();
		 s.A_pno();
		 s.A_lno();
		 s.create();
		 s.no();
	}

}
