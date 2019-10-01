package com.selenium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class TestWithJenkins1
{
	private WebDriver driver;
	
	@BeforeEach
	void setUp() throws Exception
	{
		String name = System.getProperty("os.name");
		System.out.println("OS name is: " + name);
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
		System.out.println("Inside TestWithJenkins1");
		driver.get("https://www.seleniumhq.org/");
		System.out.println("The title of the page is: " + driver.getTitle());
	}
}
