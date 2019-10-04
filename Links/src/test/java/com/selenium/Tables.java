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

import io.github.bonigarcia.wdm.WebDriverManager;

class Tables
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
		driver.get("https://the-internet.herokuapp.com/tables");		
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
		List<WebElement> list = driver.findElements(By.xpath("//table[2]/tbody/tr"));
		
		for (WebElement row: list)
			System.out.println(row.getText().split(" ")[3]);
		
		String cellXPath;
		for (int i = 1; i <= list.size(); i++)
		{
			cellXPath = "//table[2]/tbody/tr[" + i + "]/td[4]";
			System.out.println(driver.findElement(By.xpath(cellXPath)).getText());
		}
	}
}
