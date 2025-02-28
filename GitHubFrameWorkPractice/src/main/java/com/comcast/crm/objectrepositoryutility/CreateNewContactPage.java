package com.comcast.crm.objectrepositoryutility;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class CreateNewContactPage {
	WebDriver driver;

	
	
	// 1. declaration

	@FindBy(name = "lastname")
	private WebElement lastNameTextField;

	@FindBy(xpath = "(//img[@src='themes/softed/images/select.gif'])[1]")
	private WebElement contNameLookupIcon;

	@FindBy(name = "search_text")
	private WebElement searchTextField;

	@FindBy(name = "search")
	private WebElement searchButton;


	@FindBy(name = "support_start_date")
	private WebElement startDateCalendar;

	@FindBy(name = "support_end_date")
	private WebElement endDateCalendar;

	@FindBy(xpath = "(//input[@title='Save [Alt+S]'])[1]")
	private WebElement saveButton;

	// 2. Initialization

	public CreateNewContactPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// 3. getters

	public void createContact(String lastname) { // passing only name component
		lastNameTextField.sendKeys(lastname);
		saveButton.click();
	}

	public void createContactToChild(String lastname, String orgName) {
		lastNameTextField.sendKeys(lastname);
		contNameLookupIcon.click();
		
		searchTextField.sendKeys(orgName);
		searchButton.click();
		driver.findElement(By.xpath("//a[text()='" + orgName + "']")).click();
	}
	
	public void createContactToParent(String lastname, String orgName) {
		
		saveButton.click();
	}

	public WebElement getLastNameTextField() {
		return lastNameTextField;
	}

	public WebElement getContNameLookupIcon() {
		return contNameLookupIcon;
	}

	public WebElement getStartDateCalendar() {
		return startDateCalendar;
	}

	public WebElement getEndDateCalendar() {
		return endDateCalendar;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}

	public WebElement getSearchTextField() {
		return searchTextField;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}

	
}
