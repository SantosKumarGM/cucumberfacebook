package com.FB;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import faceBookLocator.locators;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import reusableC.codes;

public class facebookReuse {
	public static locators locatorss = new locators();
	public static codes code =codes.getInstance();
	//public static locators locatorss = locators.getInstance();
//	public static WebDriver driver;
//	public static Actions actions;
	public static Select s;
	//public static String firstname;
	
	@Given("Launch Facebook {string}")
	public void launch_facebook(String url) {
		//code.LaunchBrowser();
	   code.gotoUrl(url);
	}

	@And("Navigate to create new account")
	public void navigate_to_create_new_account() throws Exception {
		 //codes.driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		codes.toclick(locatorss.getCreate());
		//codes.toclick(locatorss.getCreate());
		Thread.sleep(3000);
		try {
			String titlename = codes.titlename();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	@When("Enter the name {string}")
	public void enter_the_name(String firstname) {
//		WebElement Fname = driver.findElement(By.xpath("//input[@name='firstname']"));
		code.inserttext(locatorss.getFname(), firstname);  //webelementt
	}
	
	@When("Enter the surname {string}")
	public void enter_the_surname(String surname) {
//		WebElement Sname = driver.findElement(By.xpath("//input[@name='lastname']"));
		code.inserttext(surname, locatorss.getSname());  //action
	}
	
	@When("Enter the number {string}")
	public void enter_the_number(String num) {
//		WebElement number = driver.findElement(By.xpath("//input[contains(@aria-label,'Mobile')]"));
		code.inserttext(locatorss.getNumber(), num); //webelementt
	}
	
	@When("Enter the password {string}")
	public void enter_the_password(String pass) {
//		WebElement passwordd = driver.findElement(By.xpath("//input[@id='password_step_input']"));
		code.inserttext(pass, locatorss.getPasswordd());  //action
	
	}
	
	@When("Enter the Date {string}")
	public void enter_the_date(String date) {
	//	WebElement day = code.driver.findElement(By.xpath("//select[@title='Day']"));
		//List<WebElement> datee = code.selectOption(locatorss.getDay());
//		for (WebElement option:datee) {
//			String getstring = code.getstring(option);
//			if(getstring.contains(date)) {
//				code.selectVisibleText(option, getstring);
//			//s.selectByVisibleText(getstring);
//			}
//			}
		code.selectVisibleText(locatorss.getDay(), date);
	}
	
	@When("Enter the Month {string}")
	public void enter_the_month(String month) {
		code.selectVisibleText(locatorss.getMonthh(), month);
//		WebElement monthh = driver.findElement(By.xpath("//select[@title='Month']"));
//		List<WebElement> montho = code.selectOption(locatorss.getMonthh());
//		for (WebElement option1:montho) {
//			String getstring = code.getstring(option1);
//			if (getstring.contains(month)) {
//				//s.selectByVisibleText(getstring);	
//				code.selectVisibleText(option1, getstring);
//			}	
//		}
	}
	
	@When("Enter the Year {string}")
	public void enter_the_year(String year) {
		code.selectVisibleText(locatorss.getYearr(), year);
//		WebElement yearr = driver.findElement(By.xpath("//select[@id='year']"));
//		List<WebElement> yearrr = code.selectOption(locatorss.getYearr());
//		for(WebElement option3:yearrr) {
//			String text = code.getstring(option3);
//			if(text.contains(year)) {
//				s.selectByVisibleText(text);
//			}
//		}
//		WebElement gender = code.driver.findElement(By.xpath("//input[@type='radio']/preceding-sibling::label[text()='Male']"));
		code.toclick(locatorss.getGender(), 0);
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
	
	
	@When("Click On Sigh Up")
	public void click_on_sigh_up() throws Exception {
	//	WebElement sign = codes.driver.findElement(By.xpath("//div[@class='_1lch']//preceding::button[text()='Sign Up']"));
		code.toclick(locatorss.getSign());
		Thread.sleep(3000);
	}

    @Then("Take screenshot {string}")
    public void take_screenshot(String firstname) {
    	code.screenshot(firstname);
    }    
}


