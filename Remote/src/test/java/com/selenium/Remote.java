package com.selenium;

import static org.junit.jupiter.api.Assertions.*;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

class Remote
{
	private RemoteWebDriver driver;
	
	@BeforeEach
	void setUp() throws MalformedURLException
	{
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setBrowserName("chrome");
		driver = new RemoteWebDriver(new URL ("http://127.0.0.1:4444/wd/hub"), capabilities );
		driver.manage().window().maximize();
	}
	@Test
	void test()
	{
		driver.get("http://book.theautomatedtester.co.uk/");
		assertTrue(driver.getTitle().contains("Selenium"));
	}
	
	@AfterEach
	void tearDown()
	{
		driver.quit();
	}
}
