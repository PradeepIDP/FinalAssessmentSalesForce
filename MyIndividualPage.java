package com.salesForcetest.pages;

import org.openqa.selenium.WebElement;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class MyIndividualPage extends ProjectSpecificMethods{
	
	public MyIndividualPage clickNew() {
		click(locateElement(Locators.XPATH, "//div[@title='New']"));
        reportStep(" New button clicked successfully","pass");
        return this;
	}
	
	public  MyIndividualPage enterLastName(String data) {
		clearAndType(locateElement(Locators.XPATH, "//input[contains(@class,'lastName compoundBLRadius')]"), data);
        reportStep(data+" entered successfully","pass");
        return this;

	}
	
	public MyIndividualPage verifyLastName(String lName) {
		WebElement lastName = locateElement(Locators.XPATH, "//span[@class='uiOutputText']");
		verifyExactText(lastName, lName);
		reportStep("SurName is Validated successfully", "PASS");
		return this;
	}
		
	public MyIndividualPage enterFirstName(String data) {
			clearAndType(locateElement(Locators.XPATH, "//input[contains(@class,'firstName compoundBorderBottom')]"), data);
	        reportStep(data+" entered successfully","pass");
	        return this;

		}
	
	public MyIndividualPage verifyFirstName(String fName, String lName) {
		WebElement firstName = locateElement(Locators.XPATH, "//span[text()='Mr. "+fName+" "+lName+"']");
		 verifyExactText(firstName, fName);
		 reportStep("Full Name is Validated", "PASS");
		 return this;
		
	}
	
	
	public MyIndividualPage clickSalutation() {
		click(locateElement(Locators.XPATH, "//a[@class='select']"));
        reportStep(" Salutation clicked successfully","pass");
        return this;

	}
	
	public MyIndividualPage selectSalutation() {
		click(locateElement(Locators.XPATH, "//a[@title='Mr.']"));
        reportStep(" Salutation selected successfully","pass");
        return this;

	}
	
	public  MyIndividualPage clickSave() {
		click(locateElement(Locators.XPATH, "(//span[text()='Save'])[2]"));
        reportStep(" Save button clicked successfully","pass");
        return this;

	}
	
	public MyIndividualPage clickEditIndividual() {
		click(locateElement(Locators.XPATH, "//div[text()='Edit']"));
        reportStep(" Salutation selected successfully","pass");
        return this;

	}
	

}
