package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



/**
 * @author pratap kurni
 * 
 * contains Login page elements & Business Library like login()
 * 
**/

public class LoginPage {
	
	// 1. declaration
	
	@FindBy(name="user_name")
	private WebElement usernameTextField;
	
	@FindBy(name="user_password")
	private WebElement passwordTextField;
	
	@FindBy(id="submitButton")
	private WebElement submitButton;
	
	// 2. initialization
	
	public LoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	// 3. getters

	public WebElement getUsernameTextField() {
		return usernameTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getSubmitButton() {
		return submitButton;
	}
	
	/**
	 *   login to application based on url, username, password arguments
	 * @param url
	 * @param username
	 * @param password
	 * 
	 */
	
	public void loginToApp(String url,String username, String password)
	{
		WebDriver driver = new ChromeDriver();
		driver.get(url);
	//	driver.manage().window().maximize();
		
		usernameTextField.sendKeys(username);
		passwordTextField.sendKeys(password);
		submitButton.click();
		
	}

	

	
}
