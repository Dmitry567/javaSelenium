package com.selenium;

import java.util.List;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

class DropDownChecks
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
		driver.get("http://www.compendiumdev.co.uk/selenium/basic_html_form.html");
		driver.manage().window().maximize();
		
	}    

	@AfterEach
	void tearDown() throws Exception
	{
		driver.quit();
	}
	

	@Test
	void dropDown()
	{
		WebElement dropDown = driver.findElement(By.name("dropdown"));
		Select s = new Select(dropDown);
		s.selectByVisibleText("Drop Down item 6");
		s.selectByIndex(1);
		String optionSelected = s.getFirstSelectedOption().getText();
		System.out.println(optionSelected);
// 1		
		List<WebElement> list = driver.findElements(By.name("dropdown"));
		for(WebElement element: list)
			System.out.println(element.getText());
// 2
		List<WebElement> options = s.getOptions();
		System.out.println("The number of options" + options.size());
		
	}
	
	@Test
	void multiSelect() throws InterruptedException
	{
		WebElement multiSelect = driver.findElement(By.name("multipleselect[]"));
		Select s = new Select(multiSelect);
		s.deselectAll();
		s.selectByIndex(0);
		s.selectByIndex(1);
		
		Thread.sleep(6000);
	}
}
