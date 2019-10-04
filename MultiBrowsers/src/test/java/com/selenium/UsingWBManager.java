package com.selenium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

class UsingWBManager
{
	private WebDriver driver;
	@BeforeAll
	static void setUpBeforeClass() throws Exception
	{
		WebDriverManager.chromedriver().setup();
	}

	@BeforeEach
	void setUp() throws Exception
	{
		driver = new FirefoxDriver();
	}

	@AfterEach
	void tearDown() throws Exception
	{
		driver.quit();
	}

	@Test
	void test()
	{
		driver.get("https://pasv.us/");
		System.out.println("Title:" + driver.getTitle());
	}
}
