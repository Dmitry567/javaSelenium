package com.selenium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class TestWithJenkins2
{
	private WebDriver driver;
	
	@BeforeEach
	void setUp() throws Exception
	{
		driver = new ChromeDriver();
	}

	@AfterEach
	void tearDown() throws Exception
	{
		driver.quit();
	}

	@Test
	void test()
	{
		System.out.println("Inside TestWithJenkins2");
		driver.get("https://pasv.us/");
		String browser = System.getProperty("browser");
		System.out.println("The browser is: " + browser);
		
	}
}
