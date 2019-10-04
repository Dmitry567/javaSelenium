package com.selenium;

import static org.junit.jupiter.api.Assertions.*;

import java.io.FileInputStream;
import java.util.Properties;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

class MultiBrowsers
{
	private WebDriver driver;
	private static String browser;// = "firefox";
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception
	{
		/*Properties prop = new Properties();
		*prop.load(new FileInputStream("browser.config"));
		*browser = prop.getProperty("browser");
	    */
		browser = System.getProperty("browser");
		System.out.println("Browser from command line is:" + browser);
	}

	@BeforeEach
	void setUp() throws Exception
	{
		switch(browser)
		{
		case "chrome" ->
		{System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver();}
		case "firefox" ->
		{System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "c:/logs/logs.txt");
		driver = new FirefoxDriver();}
		}
	}

	@AfterEach
	void tearDown() throws Exception
	{
		driver.quit();
	}

	@Test
	void test()
	{
		driver.get("https://www.seleniumhq.org");
		System.out.println("The title of the page:" + driver.getTitle());
		try
		{
			Thread.sleep(3000);
		} catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
