package com.selenium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class WithPO
{
	private WebDriver driver;
	
	@BeforeEach
	void setUp() throws Exception
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@AfterEach
	void tearDown() throws Exception
	{
		driver.quit();
	}

	@Test
	void validLogin()
	{
	  HomePage homePage = LoginPage.open(driver)
	                               .validLogin("tomsmith", "SuperSecretPassword!");      
	  assertTrue(homePage.getLoginConfirmation().contains("You logged into"));
	  
	  
	  LoginPage loginPage = homePage.logout();
	  assertTrue(loginPage.getConfirmation().contains("You logged out"));
	}
	
	@ParameterizedTest
	@CsvFileSource(resources = "ddt.csv", numLinesToSkip = 1)
	void invalidLogin(String username, String password , String expectedError)
	{
		LoginPage loginPage = LoginPage.open(driver)
				                       .invalidLogin(username, password);
		assertTrue(loginPage.getConfirmation().contains(expectedError));
	}
}
