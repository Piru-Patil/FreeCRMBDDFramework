package stepDefinitions;

import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginStepDefinition {
	
WebDriver driver;
	
	@Given("^user is already on login page$")
	public void user_is_already_on_login_page()
	{
		System.setProperty("webdriver.edge.driver","/Automation/CRMBDDFreamework/Driver/msedgedriver.exe");
		EdgeOptions options = new EdgeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new EdgeDriver(options);
		driver.get("https://freecrm.com/");
	}
	
	@When("^title of the page is Free CRM$")
	public void title_of_the_page_is_free_crm() {
		 String title = driver.getTitle();
		 System.out.println(title);
		 Assert.assertEquals("#1 Free CRM Software Power Up your Entire Business Free Forever", title);	 
	}
	
	@When("^user clicks on login button$")
	public void user_click_on_login_button() {
		driver.findElement(By.xpath("//span[contains(.,'Log In')]")).click();
	}
	
	@Then("^user enters \"(.*)\" and \"(.*)\"$")
	public void user_enters_username_and_password(String username, String password) {
		driver.findElement(By.name("email")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
	}
	
	@Then("^user clicks on login$")
	public void user_clicks_on_login() {
		driver.findElement(By.xpath("//div[text()='Login']")).click();
	}
	
	@And("^user is on homepage$")
	public void user_is_on_homepage() {
		String tlt = driver.getTitle();
		System.out.println(tlt);
		Assert.assertEquals("Cogmento CRM",tlt);
	}
	
	@Then("^user moves to new contact page$")
	public void user_moves_to_new_contact_page() {
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Contacts')]"))).build().perform();
		driver.findElement(By.xpath("//span[contains(text(),'Contacts')]")).click();
	}
	
	@Then("^click on create button$")
	public void click_on_create_button() {
		driver.findElement(By.xpath("//button[contains(text(),'Create')]")).click();
	}
	
	@Then("^user enter contact details \"(.*)\" and \"(.*)\" and \"(.*)\" $")
	public void user_enters_contact_details_firstname_and_lastname_and_company(String firstname, String lastname, String company) {
		driver.findElement(By.xpath("//input[@name = 'first_name']")).sendKeys(firstname);
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys(lastname);
		driver.findElement(By.xpath("//div[@name='company']")).sendKeys(company);
	}
	
	@Then("^click on save button$")
	public void click_on_save_button() {
		driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
	}
		
	@Then("^close the browser$")
	public void close_the_browser() {
		driver.quit();
	}
}

