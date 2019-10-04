package com.selenium;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

class ElementExists
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
		driver.get("https://www.kmart.com/");
		driver.manage().window().maximize();
		
	}    

	@AfterEach
	void tearDown() throws Exception
	{
		driver.quit();
	}
	

	@Test
	void verifyElementExistence()
	{
		driver.findElement(By.linkText("Help")).click();
		assertEquals(1, driver.findElements(By.id("question")).size());
		
		
		List<WebElement> list = driver.findElements(By.id("myElement"));
		assertTrue(0 == list.size());
	}
	
	@Test
	void scrolling() throws InterruptedException
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scroll(0, 6000)");
		Thread.sleep(5000);
	}
}
