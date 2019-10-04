package com.selenium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

class ElementStates
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
		driver.get("https://book.theautomatedtester.co.uk//");
		driver.manage().window().maximize();
		
	}    

	@AfterEach
	void tearDown() throws Exception
	{
		driver.quit();
	}
	
	@Test
	void gettingStates()
	{
		driver.findElement(By.linkText("Chapter1")).click();
		WebElement  checkbox = driver.findElement(By.name("selected(1234"));
		assertTrue(checkbox.isDisplayed());
		
		checkbox.click();
		assertTrue(checkbox.isSelected());
		
	}
	
	@Test
	void readingInputField()
	{
		WebElement textbox = driver.findElement(By.id("q"));
		textbox.sendKeys("Dmitry");
		String text = textbox.getAttribute("value");
		assertEquals("Dmitry", text);
	}
}
