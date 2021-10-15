package com.pomPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	
	private WebDriver driver;
	
	private By signIn = By.xpath("//span[text()='Sign in']");
	private By usernmae = By.xpath("//span[text()='Submit']//preceding::input[2]");
	private By password = By.xpath("//span[text()='Submit']//preceding::input[1]");
	private By loginBtn = By.xpath("//span[text()='Submit']");
	private By logo = By.xpath("//*[text()='menu']//following::span[text()='ANKUSH ROADLINES'][2]");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	
	public void clickSignInButton() {
		driver.findElement(signIn).click();
	}
	
	public void enteruserName(String user)
	{
		driver.findElement(usernmae).sendKeys(user);
	}
	
	public void enterpassword(String pwd) {
		driver.findElement(password).sendKeys(pwd);
	}
	
	public void clickLoginButton() {
		driver.findElement(loginBtn).click();
	}
	
	public void verifyUserisOnHomePage() {
		driver.findElement(logo).isDisplayed();
	}
}
