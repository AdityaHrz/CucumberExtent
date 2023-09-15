package com.cucumber.actions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.support.PageFactory;

import com.cucumber.locators.LoginPageLocators;
import com.cucumber.utils.HelperUtils;

public class LoginPageActions {
	LoginPageLocators objloginPage;
	String strUserName,strPassword;
	public LoginPageActions()
	{
		this.objloginPage=new LoginPageLocators();
		PageFactory.initElements(HelperUtils.getDriver(), objloginPage);	
	}
	//set user in textbox

	   public void setUsername(String strUserName)
	    {
		    objloginPage.username.sendKeys(strUserName);
	    }
	//set pass in textbox
		public void setPassword(String strPassword)
		{
			objloginPage.password.sendKeys(strPassword);
		}
    //click on login page
		public void clickLogin()
		{
			objloginPage.LoginButton.click();
		}
		public void fileOpen() {
		File file=new File("src\\test\\resources\\Data1.properties");
		
		FileInputStream fileInput = null;
		try {
			fileInput =new FileInputStream(file);
		}catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		Properties prop = new Properties();
		try {
			prop.load(fileInput);
		}catch (IOException e)
		{
			e.printStackTrace();
		}
		strUserName=prop.getProperty("username");
		strPassword=prop.getProperty("password");

		//Fill userName
		this.setUsername(strUserName);

		//Fill Password
		this.setPassword(strPassword);

		//click on login
		this.clickLogin();
		}
}

