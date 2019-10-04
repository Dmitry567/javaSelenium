package com.selenium;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Set;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

class SwitchingWindows
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
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/windows");		
	    driver.manage().window().maximize();
		
	}    

	@AfterEach
	void tearDown() throws Exception
	{
		driver.quit();
	}
	@Test
	void test()
	{
		String firstTab = driver.getWindowHandle();
		String secondTab = "";
		
		driver.findElement(By.linkText("Click Here")).click();
		Set<String> allWindowHandles = driver.getWindowHandles();
		for (String handle: allWindowHandles)
			if(!handle.equals(firstTab))
				secondTab = handle;
		
		driver.switchTo().window(firstTab);
		assertEquals("The Internet", driver.getTitle());
		driver.close();
		
		driver.switchTo().window(secondTab);
		assertEquals("New Window", driver.getTitle());
	}
}
