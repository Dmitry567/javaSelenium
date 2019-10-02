package com.selenium;

import static org.junit.jupiter.api.Assertions.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Base
{
	private static String URL = "https://the-internet.herokuapp.com/login";
	private String title = "The Internet";
	
//elements
	@FindBy(id = "username")
	private WebElement username;
	
	@FindBy(id = "password")
	private WebElement password;
	
	@FindBy(className = "radius")
	private WebElement loginButton;
	
	@FindBy(id = "flash")
	private WebElement confirmLogout;
//constructor
	public LoginPage(WebDriver adriver)
	{
		driver = adriver;
		assertEquals(title, driver.getTitle());
	}
	
//services
	public static LoginPage open(WebDriver driver)
	{
		driver.get(URL);
		return PageFactory.initElements(driver, LoginPage.class);
		
		
	}
	
	public void submitLogin(String user, String pass)
	{
		username.sendKeys(user);
		password.sendKeys(pass);
		clickElement(loginButton);
	}
	
	public HomePage validLogin(String user, String pass)
	{
		submitLogin(user, pass);
		return PageFactory.initElements(driver, HomePage.class); 
	}
	
	public LoginPage invalidLogin(String user, String pass)
	{
		submitLogin(user, pass);
		return this;
	}
	
	public String getConfirmation()
	{
		return confirmLogout.getText();
	}
	
}
