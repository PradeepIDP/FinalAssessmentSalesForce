package com.testsalesforce.testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.salesForcetest.pages.LoginPage;


public class TC001_CreateIndividual extends ProjectSpecificMethods {

	@BeforeTest
	public void setValues() {
		testcaseName = "Create Individual";
		testDescription ="Create a individual from salesforce";
		authors="Pradeep";
		category ="Smoke";
		excelFileName="testsalesforce";
	}
	
	@Test(dataProvider = "fetchData")
	public void runLogin(String username, String password, String lName, String fName) {
		new LoginPage().enterUsername(username).enterPassword(password).clickLogin().clickMenu()
		.clickViewAll1()
		.selectIndividual()
		.clickNew()
		.enterLastName(lName)
		.clickSave()
		.verifyLastName(lName)
		.clickEditIndividual()
		.clickSalutation()
		.selectSalutation()
		.enterFirstName(fName)
		.clickSave()
		.verifyFirstName(fName,lName);
		
	}
}
