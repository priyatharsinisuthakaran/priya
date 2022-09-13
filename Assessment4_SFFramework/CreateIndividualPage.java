package com.leaftaps.pages;

import org.openqa.selenium.WebElement;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class CreateIndividualPage extends ProjectSpecificMethods{
	
public CreateIndividualPage enterSurName(String surName){

	WebElement ele = locateElement(Locators.XPATH,"//input[contains(@class,'lastName compoundBLRadius')]");
	clearAndType(ele, surName);
	click(locateElement(Locators.XPATH, "(//span[text()='Save'])[2]"));
	reportStep("Last Name is entered", "PASS");
	return this;

}

public CreateIndividualPage validateSurName(String sName) {

	WebElement surName = locateElement(Locators.XPATH, "//span[@class='uiOutputText']");
	verifyExactText(surName, sName);
	reportStep("SurName is Validated", "PASS");
	return this;

}

public CreateIndividualPage clickEdit() {
	
	click(locateElement(Locators.XPATH, "//div[@title='Edit']"));
	reportStep("Clicked individuls page", "PASS");
	return this;
	
}

public CreateIndividualPage selectSalutation(String salutation) {
	
	click(locateElement(Locators.XPATH, "//a[@class='select']"));
	click(locateElement(Locators.XPATH, "//a[text()='"+salutation+"']"));
	reportStep("Select Salutation", "PASS");
	return this;
	
}

public CreateIndividualPage enterFirstName(String firstName) {
	
	WebElement ele = locateElement(Locators.XPATH, "//input[contains(@class,'firstName compoundBorderBottom')]");
	clearAndType(ele, firstName);
	click(locateElement(Locators.XPATH, "(//span[text()='Save'])[2]"));
	reportStep("Entered First name", "PASS");
	return this;
}

public CreateIndividualPage validateFullName(String fullName) {
		 
 WebElement nameSal = locateElement(Locators.XPATH, "//span[text()='"+fullName+"']");
 verifyExactText(nameSal, fullName);
 reportStep("Full Name is Validated", "PASS");
 return this;
 
}

}
