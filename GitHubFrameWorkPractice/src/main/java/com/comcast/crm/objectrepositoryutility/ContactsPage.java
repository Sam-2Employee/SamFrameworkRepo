package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPage {
	@FindBy(xpath = "//img[contains(@title,'Create Contact...')]")
	private WebElement createNewContactButton;
	@FindBy(xpath = "//img[contains(@title,'Create Contact...')]")
	private WebElement createNewContactButtons;
	
	// 2. initialization
	
	public ContactsPage(WebDriver driver) {
	
		PageFactory.initElements(driver, this);
	}
	
	// 3. getters


	public WebElement getCreateNewContactButton() {
		return createNewContactButton;
	}
	
	
	


}
