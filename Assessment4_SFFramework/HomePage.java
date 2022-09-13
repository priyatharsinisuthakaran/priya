package com.leaftaps.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods{
	
	public MyIndividualPage verifyHomePage() {
		verifyDisplayed(locateElement(Locators.CLASS_NAME, "slds-global-header__item"));
		reportStep("Homepage loaded", "pass");
		return new MyIndividualPage();
	}
	
}
