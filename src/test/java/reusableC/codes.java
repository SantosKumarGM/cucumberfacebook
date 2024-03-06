package reusableC;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class codes {
	public static WebDriver driver;
	public static Actions actions;
	public static JavascriptExecutor js;
	
	public static codes code = null;
	private codes() {}
	public static codes getInstance() {
		if(code==null){
			code=new codes();
		}
		return code;
		
	}

	
	
	
	public static void LaunchBrowser() {
		WebDriverManager.edgedriver().setup();
		EdgeOptions options = new EdgeOptions();
		driver = new EdgeDriver(options);
		options.addArguments("start-maximized");
		actions=new Actions(driver);
		js= (JavascriptExecutor)driver;	
	}
	
	public void gotoUrl(String url) {
		driver.get(url);
	}
	
	public void handlewindowsURL(String url) {  //WindowsHandle
		driver.switchTo().window(url);
	}

	public void handlewindowsTITLE(String text) {  //WindowsHandle
		driver.switchTo().window(text);
	}

	public void handlewindowsID(String id) {  //WindowsHandle
		driver.switchTo().window(id);
	}

	public void inserttext(WebElement d ,String value) {
		d.sendKeys(value);
	}
	
	public void inserttext(String value,WebElement e) { //actions
		actions.sendKeys(e, value).build().perform();
	}

	public void inserttext(String value, WebElement e,int i) { //JavascriptExecutor
		js.executeScript("arguments[0].setAttribute('value',"+value+")", e);
	}
	
	public void inserttext(Alert a, String value) {
		a.sendKeys(value);
	}

	public static void toclick(WebElement d) {
		d.click();
	}

	public void pageRefresh() {
		driver.navigate().refresh();
	}

	public static String titlename() {
		String title = driver.getTitle();
		return title;
	}

	public static void closebrowser() {
		driver.quit();
	}
	
	public void pageurl(String url) {
		driver.get(url);
	}

	public boolean displayed(WebElement ele) { //VisibilityOfWebElement
		boolean displayed = ele.isDisplayed();
		return displayed;
	}

	public boolean selected(WebElement ele) { //VisibilityOfWebElement
		boolean selected = ele.isSelected();
		return selected;
	}

	public boolean enabled(WebElement ele) { //VisibilityOfWebElement
		boolean enabled = ele.isEnabled();
		return enabled;
	}

	public String getstring(WebElement ele) {
		String text = ele.getText();
		return text;
		
	}

	public String attribute(WebElement ele,String value) {
		String attribute = ele.getAttribute(value);
		return attribute;
	}

	public void gotoElement(WebElement ele) { //actions
		actions.moveToElement(ele).build().perform();
	}

	public void rightClick(WebElement ele) { //actions
		actions.contextClick(ele).build().perform();
	}
	
	public void twoClick(WebElement ele) { //actions
		actions.doubleClick().build().perform();
	}

	public void moveOneElementToAnother(WebElement source, WebElement target) { //actions
		actions.dragAndDrop(source, target);
	}
	
	public void toclick(WebElement ele ,int x) { //actions
		actions.click(ele).build().perform();
	}

	public void screenshot(String firstname) {  //ScreenShot
		TakesScreenshot t= (TakesScreenshot)driver;
		File f =t.getScreenshotAs(OutputType.FILE);
		File m =new File("C:\\Users\\gmsan\\eclipse-workspace\\java\\faceBookShortt\\target"+firstname+".png");
		try {
			FileUtils.copyFile(f, m);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void scrollUp() { //JavascriptExecutor
		js.executeScript("arguments[0].scrollIntoView", true);
	}

	public void scrolldown() { //JavascriptExecutor
		js.executeScript("arguments[0].scrollIntoView", false);
	}


	public void button(WebElement ele) { //JavascriptExecutor
		js.executeScript("arguments[0].click", ele);
	}

	public void selectVisibleText(WebElement dropdown , String visibletext ) {  //DropDown
		Select s = new Select(dropdown);
		s.selectByVisibleText(visibletext);
	}

	public void selectValue(WebElement dropdown, String value) {  //DropDown
		Select s = new Select(dropdown);
		s.selectByValue(value);
	}

	public List<WebElement> selectOption(WebElement dropdown) {  //DropDown
		Select s = new Select(dropdown);
		List<WebElement> options = s.getOptions();
		return options;
	}
	
	public List<WebElement> allselectOption(WebElement dropdown) {  //DropDown
		Select s = new Select(dropdown);
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		return allSelectedOptions;
	}
	
	public WebElement firstselectOption(WebElement dropdown) {  //DropDown
		Select s = new Select(dropdown);
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		return firstSelectedOption;
	}
	
	public boolean multiple(WebElement dropdown, String value) {  //DropDown
		Select s = new Select(dropdown);
		boolean multiple = s.isMultiple();
		return multiple;
	}

	public void selectIndex(WebElement dropdown, String value) {  //DropDown
		Select s = new Select(dropdown);
		s.selectByIndex(2);
	}
	
	public void deselectVisibleText(WebElement dropdown , String visibletext ) {  //DropDown
		Select s = new Select(dropdown);
		s.deselectByVisibleText(visibletext);
	}

	public void deselectValue(WebElement dropdown, String value) {  //DropDown
		Select s = new Select(dropdown);
		s.deselectByValue(value);
	}
	
	public void deselectIndex(WebElement dropdown) {  //DropDown
		Select s = new Select(dropdown);
		s.deselectByIndex(2);
	}

	public void defaultFrame() {  //frame
		driver.switchTo().defaultContent();
	}

	public void daddyFrame() {  //frame
		driver.switchTo().parentFrame();
	}

	public void nextFrame(WebElement ele) {  //frame
		driver.switchTo().frame(ele);
	}
	
	public void nextFrame(String id) {  //frame
		driver.switchTo().frame(id);
	}
	
	//jdbc
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
	
	
		Class.forName("com.microsoft.sqlserver");
	
	String connectionString ="sdjfhbkjs:9090//adbc;username=santos;password=1234;trustedconnection=true";
	Connection connection = DriverManager.getConnection(connectionString);
	Statement statement = connection.createStatement();
	ResultSet executeQuery = statement.executeQuery("Select * from tableName");
	String string = executeQuery.getString(0);
	
	}

	public Alert popup() { //Alert
		Alert alert = driver.switchTo().alert();
		return alert;
	}
	
	public void alertAccept(Alert alert) { //Alert
		alert.accept();
	}
	
	public void alertDismiss(Alert alert) { //Alert
		alert.dismiss();
	}
	
	public String alertgetText(Alert alert) { //Alert
		String text = alert.getText();
		return text;
	}

	public void waitss() {
		
	}

}
