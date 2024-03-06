package faceBookLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import reusableC.codes;

public class locators {
	
//	public static locators locators = null;
	public locators() {
		PageFactory.initElements(codes.driver,this);
	}
//	public static locators getInstance() {
//		if(locators==null){
//			locators = new locators();
//		}
//		return locators;
//		
//	}
	@FindBy(xpath = "//a[text()='Create new account']")
	private WebElement create;
	
	@FindBy(xpath="//input[@name='firstname']")
	private WebElement Fname;
	
	@FindBy(xpath = "//input[@name='lastname']")
	private WebElement Sname;
	
	@FindBy(xpath = "//input[contains(@aria-label,'Mobile')]")
	private WebElement number;
	
	@FindBy(xpath = "//input[@id='password_step_input']")
	private WebElement passwordd;
	
	@FindBy(xpath = "//select[@title='Day']")
	private WebElement day;
	
	@FindBy(xpath = "//select[@title='Month']")
	private WebElement monthh;
	
	@FindBy(xpath = "//select[@id='year']")
	private WebElement yearr;
	
	@FindBy(xpath = "//input[@type='radio']/preceding-sibling::label[text()='Male']")
	private WebElement gender;
	
	@FindBy(xpath = "//div[@class='_1lch']//preceding::button[text()='Sign Up']")
	private WebElement sign;

	public WebElement getCreate() {
		return create;
	}

	public WebElement getFname() {
		return Fname;
	}

	public WebElement getSname() {
		return Sname;
	}

	public WebElement getNumber() {
		return number;
	}

	public WebElement getPasswordd() {
		return passwordd;
	}

	public WebElement getDay() {
		return day;
	}

	public WebElement getMonthh() {
		return monthh;
	}

	public WebElement getYearr() {
		return yearr;
	}

	public WebElement getGender() {
		return gender;
	}

	public WebElement getSign() {
		return sign;
	}
}

