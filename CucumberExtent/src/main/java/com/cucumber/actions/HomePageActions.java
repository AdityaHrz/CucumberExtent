package com.cucumber.actions;

import org.openqa.selenium.support.PageFactory;

import com.cucumber.locators.HomePageLocators;
import com.cucumber.utils.HelperUtils;

public class HomePageActions {
	HomePageLocators homePageLocators = null;
	
	public HomePageActions() {
		this.homePageLocators = new HomePageLocators();
		
		PageFactory.initElements(HelperUtils.getDriver(), homePageLocators);
	}
	//get the username from homepage
	public String getHomepageText()
	{
		return homePageLocators.Dashboard.getText();
	}

}
