package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class HomePage extends TestBase{
	
	@FindBy(xpath="//td[contains(text(), 'user:piru p')]")
	WebElement username;
	
	@FindBy(xpath="//a[contains(text(),'contacts')]")
	WebElement contactslink;
	
	@FindBy(xpath="//a[contains(text(),'Deals')]")
	WebElement dealslink;
	
	@FindBy(xpath="//a[contains(text(),'Tasks')]")
	WebElement tasklink;
	
	//Initilizing the page objects
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	public String verifyHomePageTitle() {
		return driver.getTitle();
	}
	
	public boolean verifyCorrectUserName() {
		return username.isDisplayed();
	}
	
	public void clickOnNewContactsLink() {
		Actions action = new Actions(driver);
		action.moveToElement(contactslink).build().perform();
		contactslink.click();
	}

}
