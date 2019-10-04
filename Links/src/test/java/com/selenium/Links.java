package com.selenium;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

class Links
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
	void testingLinks()
	{
        List<WebElement> list = driver.findElements(By.tagName("a"));
        int numberOfLinks = list.size();
        System.out.println("Number of links on the page" + numberOfLinks);
        
        for(WebElement element: list)
        	System.out.println(element.getText());
        for(WebElement element: list)
        	System.out.println(element.getAttribute("href"));
        
        	
	}
	@Test
	void getPageHTML()
	{
		String body = driver.getPageSource();
		System.out.println(body);
		assertTrue(body.contains("Selenium"));
	}
}
