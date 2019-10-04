package com.selenium;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

class ScreenShots
{
	private WebDriver driver;
	
	@BeforeEach
	void setUp() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://pasv.us");
		driver.manage().window().maximize();
	}

	@AfterEach
	void tearDown() throws Exception
	{
		driver.quit();
	}

	@Test
	void getScreenshotofVisibleArea() throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot) driver;
		FileHandler.copy(ts.getScreenshotAs(OutputType.FILE),new File("VisibleArea.png"));
	}
	
	@Test
	void getEntireArea() throws IOException
	{
		Screenshot entirePage = new AShot()
				.shootingStrategy(ShootingStrategies.viewportPasting(3000))
				.takeScreenshot(driver);
		ImageIO.write(entirePage.getImage(), "pmg", new File("EntireArea.pmg"));
	}
}
