package com.selenium;

import static org.junit.jupiter.api.Assertions.*;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

class Grid
{
	private WebDriver driver;
	@Test
	void testInChrome() throws MalformedURLException
	
	{
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setBrowserName("chrome");
		capabilities.setPlatform(Platform.WINDOWS);
		driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),capabilities);
		driver.get("https://www.kmart.com");
	}
	
	@AfterEach
	void tearDown()
	{
		driver.quit();
	}
}
