package com.FB;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import reusableC.codes;


public class hookes {
	//codes code = new codes();
		//public static codes code =codes.getInstance();
		
		@Before
		public void launching(Scenario source) {
			codes.LaunchBrowser();
		//final byte[] screenshotAs = ((TakesScreenshot)codes.driver).getScreenshotAs(OutputType.BYTES);
	      //  source.embed(screenshotAs,"image/png");	
		}
		
		@After
		public void closing(Scenario source) {
			
//			final byte[] screenshotAs = ((TakesScreenshot)code.driver).getScreenshotAs(OutputType.BYTES);
//			
			//codes.closebrowser();
		}
		

}
