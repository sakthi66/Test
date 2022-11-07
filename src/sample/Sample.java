package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sample {
	//Page Object Model
   
	@FindBy(id="username")
	private WebElement user;

	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(xpath="//button[text()='Log in']")
	private WebElement login;
	
	@FindBy(xpath="//span[text()=' Customers']")
	private WebElement customer;

	@FindBy(xpath="//span[text()=' Create Customer']")
	private WebElement cc;
	
	@FindBy(id="email")
	private WebElement email;
	
	@FindBy(id= "title")
	private WebElement title;
	
	@FindBy(xpath="(//div[text()='Mr'])[2]")
	private WebElement t1;
	
	@FindBy(id="firstName")
	private WebElement fn;
	
	@FindBy(id="lastName")
	private WebElement ln;
	
	@FindBy(id="middleName")
	private WebElement mn;
	
	@FindBy(id="dob")
	private WebElement dob;
	
	@FindBy(id="genderId")
	private WebElement gender;
	
    @FindBy(xpath="//div[text()='Male']")
    private WebElement g1;
    
    @FindBy(id="phoneNumber")
    private WebElement pn;
    
    @FindBy(id="phoneNumberLl")
    private WebElement lan;
    
    @FindBy(id="anniversary")
    private WebElement anniversary;
    
    @FindBy(xpath="//div[text()='Customer Address']")
    private WebElement cadd;
    
    @FindBy(xpath="//button[text()=' Add']")
    private WebElement add;
    
    @FindBy(id="address_0_title")
    private WebElement title1;
    
    @FindBy(id="address_0_email")
    private WebElement A_email;
    
    @FindBy(id="address_0_firstName")
    private WebElement A_fn;
    
    @FindBy(id="address_0_addressLine1")
    private WebElement address1;
    
    @FindBy(id="address_0_addressLine2")
    private WebElement address2;
    
    @FindBy(id="address_0_addressLine3")
    private WebElement address3;
    
    @FindBy(id="address_0_lastName")
    private WebElement A_ln;
    
    @FindBy(id="address_0_middleName")
    private WebElement A_mn;
    
    @FindBy(id="address_0_city")
    private WebElement A_city;
    
    @FindBy(id="address_0_stateId")
    private WebElement A_state;
    
    @FindBy(id="address_0_countryId")
    private WebElement A_country;
    
    @FindBy(id="address_0_pincode")
    private WebElement A_pincode;
    
	@FindBy(id="address_0_phoneNumber")
	private WebElement A_pno;
	
	@FindBy(id="address_0_phoneNumberLl")
	private WebElement A_lno;
	
	@FindBy(xpath="//button[text()=' Create']")
	private WebElement create;
	
	@FindBy(xpath="//button[text()='No']")
	private WebElement no;
	
    public Sample(WebDriver driver) {
	PageFactory.initElements(driver,this);
	}
    public void email() {
    	user.sendKeys("thebramhatest+admin1@gmail.com");
    }
    public void password() {
    	password.sendKeys("Test@1234");
    }
    public void login() {
	   login.click();
    }
    public void customer() {
    	customer.click();
    }
    public void cc() {
    	cc.click();
    }
    public void email1() {
    	email.sendKeys("thebramhatest+customer66@gmail.com");
    }
    public void title() {
    	title.click();
    }
    public void t1() {
    	t1.click();
    }
    public void fn() {
    	fn.sendKeys("sakthi");
    }
    public void ln() {
    	ln.sendKeys("vel");
    }
    public void mn() {
    	mn.sendKeys("good");
    }
    public void dob() {
    	dob.sendKeys("10/05/1999");
    }
    public void gender() {
    	gender.click();
    }
    public void g1() {
    	g1.click();
    }
    public void pn() {
    	pn.sendKeys("+919629889896");
    }
    public void lan() {
    	lan.sendKeys("+919999999999");
    }
    public void anniversary() {
    	anniversary.sendKeys("04/11/2022");
    }
    public void cusaddress() {
    	cadd.click();
    }
    public void add() {
    	add.click();
    }
    public void title1() {
    	title1.sendKeys("Mr");
    }
    public void A_email() {
    	A_email.sendKeys("svj@gmail.com");
    }
    public void A_fn() {
    	A_fn.sendKeys("good");
    }
    public void address1() {
    	address1.sendKeys("53/1,vivekananda street");
    }
    public void address2() {
    	address2.sendKeys("NG pudur");
    }
    public void address3() {
    	address3.sendKeys("gnmills(po)");
    }
    public void A_ln() {
    	A_ln.sendKeys("bad");
    }
    public void A_mn() {
    	A_mn.sendKeys("not bad");
    }
    public void A_city() {
    	A_city.sendKeys("coimbatore");
    }
    public void A_state() {
    	A_state.click();
    }
    public void A_country() {
    	A_country.click();
    }
    public void A_pincode() {
    	A_pincode.sendKeys("641029");
    }
    public void A_pno() {
    	A_pno.sendKeys("+919629889896");
    }
    public void A_lno() {
    	A_lno.sendKeys("+919999999999");
    }
    public void create() {
    	create.click();
    }
    public void no() {
    	no.click();
    }
}

