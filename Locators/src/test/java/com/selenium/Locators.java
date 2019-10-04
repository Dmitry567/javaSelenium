package com.selenium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

class Locators
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
	void test()
	{
// by class name
		driver.findElement(By.className("ribbon-kmart-logo")).click();
		
//by CSS selector
		driver.findElement(By.cssSelector("#yourAccount")).click();
		driver.navigate().refresh();
		
// by id
		driver.findElement(By.id("keyword")).sendKeys("milk");
		
		
// by link text
		driver.findElement(By.linkText("Kmart home")).click();
		
// by name
		driver.findElement(By.name("keyword")).sendKeys("coke");
		
// by partial link text
		driver.findElement(By.partialLinkText("home")).click();
		
// by tag name
		System.out.println(driver.findElement(By.tagName("body")).getText());
		
// by XPath
		driver.findElement(By.xpath("//span[@class='gnf-skinny-3']//a[@class='gnf_tree_junction'][contains(text(),'Shoes')]")).click();
		
		
		driver.findElement(By.className(".ytp-play-button.ytp-button")).click();
		
	}
}
