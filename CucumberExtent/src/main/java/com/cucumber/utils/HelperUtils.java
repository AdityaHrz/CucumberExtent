package com.cucumber.utils;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

	public class HelperUtils {
		private static HelperUtils helperUtils;
		private static WebDriver driver;
		private static WebDriverWait wait;
		public final static int TIMEOUT = 10;
		
		HelperUtils(){
			driver = new ChromeDriver();
			wait = new WebDriverWait(driver,Duration.ofSeconds(TIMEOUT));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
			driver.manage().window().maximize();
		}
		public static void openPage(String URL)
		{
			driver.get(URL);
		}

		public static WebDriver getDriver() {
			return driver;
		}

		public static void setDriver() {
			if(helperUtils==null) 
			{
				helperUtils=new HelperUtils();
			}
		}
		
		public static void tearDown()
		{
			if(driver!=null) {
				
				driver.close();
				//driver.quit();
		}
			helperUtils=null;
		}
		
	
}
