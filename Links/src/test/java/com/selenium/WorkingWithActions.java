package com.selenium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

class WorkingWithActions
{
    private WebDriver driver;
    private Actions builder;

		
	@BeforeEach
	void setUp() throws Exception
	{
		driver = new ChromeDriver();
		builder = new Actions(driver);		
	    driver.manage().window().maximize();
		
	}    

	@AfterEach
	void tearDown() throws Exception
	{
		driver.quit();
	}	
		
	@Test
	void moveMouseWithAlert() throws InterruptedException
	{
		driver.get("https://book.theautomatedtester.co.uk/chapter4");
		WebElement mouseOver = driver.findElement(By.id("hoverOver"));
		builder.moveToElement(mouseOver).perform();
		
		
		Thread.sleep(3000);
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		Thread.sleep(3000);
		
		
	}
	
	@Test
	void moveMouseWithOffset()
	{
		driver.navigate().to("https://www.webminal.org/");
		WebElement button = driver.findElement(By.linkText("Register"));
		builder.moveByOffset(button.getLocation().getX() + 6, button.getLocation().getY() +6)
		      .click()
		      .perform();
		assertEquals("Join", driver.findElement(By.xpath("//h2[contains(text(),'Join')]")).getText());
	}
}
